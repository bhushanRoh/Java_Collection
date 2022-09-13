package com.collectionFramework.collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<String> daysOfWeek= new HashSet<>();

        // Adding Element
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek);

        //Adding Duplicate ELement

        daysOfWeek.add("Monday");
        System.out.println(daysOfWeek);

    }
}
