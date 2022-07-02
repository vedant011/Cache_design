package com.company;

import com.company.algorithms.LRU;
import com.company.mystorage.storage_pattern;

import java.util.HashMap;

//import com.company.mystorage.storage_pattern;
//
public class mycache<key , value>  implements storage_pattern<key , value> {
    int size ;
    Object ketype;
    Object valueType;
    LRU<key> lru;
    HashMap<key , value> map;
    public mycache(int size) {
        this.size = size;

        lru = new LRU();
        map = new HashMap<>();
    }

//    public void get_me_usage()
//    {
//
//    }

    @Override
    public String toString() {

        return map.values().toString();


    }

    public int getSize()
    {
        return map.size();
    }

    @Override
    public void put(key key , value value) {
        if(map.containsKey(key))
        {
            lru.keyaccessed(key);
            map.put(key , value);
//            System.out.println(lru.d);
            return;
        }
        if(map.size() >= size)
        {
          key keytoremove = RemoveIfStorageFull();
//            System.out.println(keytoremove.);
          map.remove(keytoremove);
          map.put(key , value);
          lru.add(key);
        }
        else{
            map.put(key ,value);
            lru.add(key);
        }
    }

    @Override
    public value get(key key) {
        if(!map.containsKey(key)){
            System.out.println("Key is not found");
            return null;
        }
        lru.keyaccessed(key);
        return  map.get(key);
    }

    @Override
    public value remove(key key) {
       if(!map.containsKey(key)){
           System.out.println("Key is not found");
           return null;
       }
        lru.remove(key);
        return map.remove(key);
    }

    @Override
    public key RemoveIfStorageFull() {
        return lru.removeifmemorygetsfull();
    }
}

