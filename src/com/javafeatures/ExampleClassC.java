package com.javafeatures;

public class ExampleClassC  implements  Features{
    @Override
    public void m1() {
        System.out.println("this method 1 in class c");
    }

    @Override
    public String sayHello(String s) {
        return "Say hello method in class c"+s;
    }

    @Override
    public void m2() {
        System.out.println("this is  method3 in class c");
    }
    public void m3() {
        System.out.println("this is defulit method in class C");
    }

    public static void main(String[] args) {
        ExampleClassC exampleClassC;
        exampleClassC = new ExampleClassC();
        exampleClassC.m1();
        exampleClassC.m2();
        exampleClassC.m3();
        System.out.println( exampleClassC.sayHello("vasu"));
        Features.methodCanNotChange();
    }
}
