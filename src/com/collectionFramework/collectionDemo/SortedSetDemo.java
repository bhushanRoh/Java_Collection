package com.collectionFramework.collectionDemo;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> fruits= new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits);

        String first= fruits.first();
        System.out.println(first);

        String last= fruits.last();
        System.out.println(last);

        Comparator<?> comparator= fruits.comparator();

        SortedSet<String> trailSet= fruits.tailSet("Grapes");
        System.out.println(trailSet);
    }
}
