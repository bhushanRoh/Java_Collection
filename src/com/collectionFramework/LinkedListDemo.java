package com.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("Laptop");
        list.add("Mouse");
        list.add("Monitor");

        System.out.println("List: "+ list);

        list.add(2,"CPU");

        System.out.println("List: "+list);

        list.addFirst("KeyBoard");

        System.out.println("List: "+list);

        List<String> fruits= new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");

        list.addAll(fruits);
        System.out.println("List: "+list);
    }
}
