package com.company.algorithms;
import com.company.mystorage.removalalgo;
public class LRU<key>  implements removalalgo {
    DoublyLinkedList<key> ddl = new DoublyLinkedList<>();


    public void keyaccessed(key key) {
        ddl.remove(key);
        ddl.addtolast(key);

    }

    public void add(key key)
    {
        ddl.addtolast(key);

    }

    public void remove(key key)
    {
        ddl.remove(key);
    }


    @Override
    public key removeifmemorygetsfull() {

        key key = ddl.first.key;
        if(ddl.first.next!=null){
            ddl.first = ddl.first.next;
            ddl.first.prev  = null;
        }

        return key;
    }
}
