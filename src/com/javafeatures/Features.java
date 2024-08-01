package com.javafeatures;

public interface Features {


    public void m1();
    public String sayHello(String s);
    public void m2();

    /*
    this is default method it can access any where and changes also possible it can implemented java8
     */

    default void m3(){
        System.out.println("this is default method we can cange and access any where");

    }
    /*
    this is static method it can not override and also it can overload is possible
     */
    static void methodCanNotChange(){
        System.out.println("this is static method");
    }

}
