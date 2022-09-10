package com.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> friends= new ArrayList<>();

        // Adding Element with duplicate value
        friends.add("Bhushan");
        friends.add("Tejas");
        friends.add("Rahul");
        friends.add("Bhushan");

        System.out.println(friends);


        // Null Value
        friends.add(null);
        friends.add(null);

        System.out.println(friends);

        //insertion order
        System.out.println(friends.get(0));
        System.out.println(friends.get(4));
    }
}
