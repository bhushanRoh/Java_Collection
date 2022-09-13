package com.collectionFramework.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
        names.add("Bhushan");
        names.add("Gaurav");
        names.add("Pranay");
        names.add("Atharva");

        System.out.println(names);

        names.remove("Pranay");

        System.out.println(names);

        System.out.println(names.contains("Bhushan"));

        names.forEach((name) -> {
            System.out.println(name);
        });
    }
}
