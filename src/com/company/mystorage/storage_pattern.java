package com.company.mystorage;

import java.util.TreeMap;

public interface storage_pattern<key , value> {

//     default void storage_pattern(String keytype, Object valueType){}

      void put(key key , value value);
      Object get(key key);
      Object remove(key key);
      Object RemoveIfStorageFull();

}
