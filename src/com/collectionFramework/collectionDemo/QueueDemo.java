package com.collectionFramework.collectionDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> elements= new LinkedList<>();

        elements.add("element1");
        elements.add("element2");
        elements.add("element3");
        elements.add("element4");
        elements.add("element5");

        System.out.println("Queue: "+elements);

        String name= elements.remove();
        System.out.println("Removed from Queue: "+ name + " NewWaitingQueue: "+elements);

        name= elements.poll();
        System.out.println("Removed from Queue: "+ name + " New WaitingQueue: "+elements);
    }
}
