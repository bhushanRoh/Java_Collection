package com.collectionFramework.collectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        // HashMap Implementation
        Map<String , Integer> numberMap=new HashMap<>();

        numberMap.put("One",1);
        numberMap.put("Two",2);
        numberMap.put("Three",3);

        numberMap.putIfAbsent("Four",4);

        System.out.println(numberMap);

        // LinkedHashMap Implementation
        LinkedHashMap<String,Integer> dayNumber= new LinkedHashMap<>();

        dayNumber.put("Monday",1);
        dayNumber.put("Tuesday",2);
        dayNumber.put("Wednesday",3);
        dayNumber.put("Thursday",4);

        dayNumber.putIfAbsent("Friday",5);

        System.out.println(dayNumber);

        //TreeMap Implementation
        TreeMap<String,String> fileExtension= new TreeMap<>();

        fileExtension.put("C++",".cpp");
        fileExtension.put("Java",".java");
        fileExtension.put("Python",".py");
        fileExtension.put("Golang",".go");

        System.out.println(fileExtension);
    }
}
