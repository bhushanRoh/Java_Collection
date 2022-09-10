package com.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<String> elements= new ArrayDeque<>();

        elements.add("Element-1");
        elements.add("Element-2");
        elements.add("Element-3");
        elements.add("Element-4");
        elements.add("Element-5");

        //Traversing Elements
        for(String element:elements){
            System.out.println(element);
        }

        Deque<String> fruits= new ArrayDeque<String>();

        fruits.offer("Mango");
        fruits.offer("Apple");
        fruits.add("Banana");
        fruits.offerFirst("Grapes");

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        fruits.pollLast();
        System.out.println("After Poll Last");

        for (String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
