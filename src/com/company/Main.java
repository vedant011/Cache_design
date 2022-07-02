package com.company;

public class Main {

    public static void main(String[] args) {

        mycache<Integer ,String>  mycache = new mycache<>(5);

        int i=0;

//
        while(i<5)
        {
            mycache.put(i  , "a"+i );
            i++;
        }


        mycache.put(6 ,"a"+6 );
//
        mycache.get(1);
//
        mycache.put(7,"a7");

        System.out.println(mycache.toString());



    }
}
