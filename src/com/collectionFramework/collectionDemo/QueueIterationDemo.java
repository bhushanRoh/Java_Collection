package com.collectionFramework.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIterationDemo {
    public static void main(String[] args) {

        Queue<String> elements= new LinkedList<>();

        elements.add("Element-1");
        elements.add("Element-2");
        elements.add("Element-3");
        elements.add("Element-4");
        elements.add("Element-5");

        //Iteration Using ForEach Method
        elements.forEach(element ->{
            System.out.println(element);
        });

        System.out.println("Iteration Using iterator()");
        //Iteration Using iterator()
        Iterator<String> elementIterator=elements.iterator();

        while(elementIterator.hasNext()){
            String name=elementIterator.next();
            System.out.println(name);
        }

        //Iterating Using iterator() and Java 8 forEachRemaining()
        System.out.println("Iterating Using iterator() and Java 8 forEachRemaining()");

        elementIterator=elements.iterator();
        elementIterator.forEachRemaining(element ->{
            System.out.println(element);
        });

        // Iterating using simple for each
        System.out.println("Iterating using simple for each");

        for(String name: elements){
            System.out.println(name);
        }


    }
}
