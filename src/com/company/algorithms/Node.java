package com.company.algorithms;

public class Node<key> {
    key key;
    Node<key> next;
    Node<key> prev;
    Node(key key){
        this.key = key;
        next = null;
        prev  = null;
    }
}
