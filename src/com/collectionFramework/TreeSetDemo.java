package com.collectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> empId= new TreeSet<>();

        empId.add(101);
        empId.add(102);
        empId.add(103);
        empId.add(104);
        empId.add(101);
        System.out.println(empId);


    }
}
