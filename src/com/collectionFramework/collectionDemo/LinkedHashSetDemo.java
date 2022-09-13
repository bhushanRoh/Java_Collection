package com.collectionFramework.collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits= new LinkedHashSet<>();

        fruits.add("Mango");
        fruits.add("Apples");
        fruits.add("Grapes");
        fruits.add("Banana");

        System.out.println(fruits);

        fruits.add("Mango");

        System.out.println(fruits);
    }
}
