package com.javafeatures;

public class ExampleOnClassB  implements Features{
    @Override
    public void m1() {
        System.out.println("this is method 1 in class B");
    }

    @Override
    public String sayHello(String s) {
        return "say hello method in class B"+s;
    }

    @Override
    public void m2() {
        System.out.println("this is  method3 in class B:");
    }
    public void m3() {
        System.out.println("this is defulit method in class B");
    }

    public static void main(String[] args) {
        ExampleOnClassB exampleOnClassB;
        exampleOnClassB = new ExampleOnClassB();
        exampleOnClassB.m1();
        exampleOnClassB.m2();
        exampleOnClassB.m3();
        System.out.println(exampleOnClassB.sayHello("vasu"));
        Features.methodCanNotChange();
    }
}
