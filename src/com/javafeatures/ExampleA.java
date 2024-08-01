package com.javafeatures;

public class ExampleA  implements Features{

    @Override
    public void m1() {
        System.out.println("this is method 1 in class A");
    }

    @Override
    public String sayHello(String s) {
        return "Say hello method in class A"+s;
    }

    @Override
    public void m2() {
        System.out.println("this  method2 in class A");

    }

    @Override
    public void m3() {
        System.out.println("this is defulit method in class A");
        System.out.println("this is defulit method in class A");
    }

    public static void main(String[] args) {
        ExampleA exampleA;
        exampleA = new ExampleA();
        exampleA.m1();
        exampleA.m2();
        exampleA.m3();

        System.out.println(exampleA.sayHello("hello"));
        Features.methodCanNotChange();

    }
}
