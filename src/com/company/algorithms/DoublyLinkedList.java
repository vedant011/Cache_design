package com.company.algorithms;

public class DoublyLinkedList<key>{

    Node<key> first;

    Node<key> last ;
    public DoublyLinkedList() {
        first = null;
        last  = null;
    }

    void remove(key node)
    {
        if(first==null)return;
        Node<key> f = first;
        Node<key> l = last;
        if(getFirst().key==node){
            first = first.next;
            first.prev = null;
            return;
        }
        if(getLast().key==node)
        {
            last = last.prev;
            last.next = null;
            return;
        }
        while(f!=l && f!=null)
        {
            if (node==f.key)
            {
                f.prev.next = f.next;
                f.next.prev = f.prev;
                return;
            }
            if(node==l.key)
            {
                l.prev.next= l.next;
                l.next.prev = l.prev;
                return;
            }
            f= f.next;
            l = l.prev;
        }
    }
     public void addtolast(Object node)
     {
//         remove(node);
         if(last==null)
         {

             if(first==null){
                 first = new Node(node);
                 last = first;

             }
             else {
                 last = new Node(node);
                 last.prev = first;
                 first.next = last;
             }

         }
         else{
             last.next = new Node(node);
             last.next.prev = last ;
             last = last.next;
         }
     }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }
}
