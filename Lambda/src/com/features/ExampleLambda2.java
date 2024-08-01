package com.features;

public class ExampleLambda2 {
    public static void main(String[] args) {
        /*
        lambda expression is used for single functional interface(sam(single abstract method)
        in interface is called functional interface
         */
        ExampleOnLambda ref = () -> {
            System.out.println("hellojava");
        };
        ref.hello();
    }


}
