package com.features;

public class Example {
    public String m1() {
        return "welcome to method reference using :: from m1";
    }

    public String m2() {
        return "welcome to method reference using :: from m1";
    }

    public static void main(String[] args) {
// Example1 ref =()-> "welcome to method reference";
        // replacing lambda expression with metod treferenceing using::

        //create object
        Example example;
        example = new Example();
// interface creation and interface reference
        Example1 example1 = example::m1;
        String s1 = example.m1();
        System.out.println(s1);

        Example1 example2 = example::m2;
        String s2 = example.m2();
        System.out.println(s2);

        Example1 ref = () -> "hello java world";
        System.out.println(  ref.methodOnExample());


    }
}
