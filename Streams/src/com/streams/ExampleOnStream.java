package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOnStream {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(0);
        l1.add(15);
        l1.add(10);
        l1.add(5);
        l1.add(30);
        l1.add(25);
        l1.add(20);
        System.out.println(l1);
//   list= arraylist.streammethod.map(function).collect(collectors.tolist());
        List<Integer> list = l1.stream().map(i -> i * 10).collect(Collectors.toUnmodifiableList());
        System.out.println(list);

        List<Integer> list1 = l1.stream().filter(i -> i > 100).collect(Collectors.toUnmodifiableList());
        System.out.println("after the filteration");
        System.out.println(list1);

        List<Integer> list3 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toUnmodifiableList());
        System.out.println("the even numbers are");
        System.out.println(list3);
        List<Integer> list4 = l1.stream().filter(i -> i % 2 != 0).collect(Collectors.toUnmodifiableList());
        System.out.println("the odd numbers are");
        System.out.println(list4);

        List<Integer> list5 = l1.stream().sorted().collect(Collectors.toUnmodifiableList());
        System.out.println("sorting order Ascending");
        System.out.println(list5);

        Comparator<Integer> comparator;
        comparator = (i1, i2) -> i2.compareTo(i1);
        List<Integer> list6 = l1.stream().sorted(comparator).collect(Collectors.toUnmodifiableList());
        System.out.println("sorting order descending");
        System.out.println(list6);

        Comparator<Integer> comparator1;
        comparator1 = (i1, i2) -> i1.compareTo(i2);
        Integer min = l1.stream().min(comparator1).get();
        System.out.println("the min value:" + min);

        Comparator<Integer> comparator2;
        comparator2 = (i1, i2) -> i1.compareTo(i2);
        Integer max = l1.stream().max(comparator2).get();
        System.out.println("the max value:" + max);

// first way to print loop
        System.out.println("firstWay");
        list.stream().forEach(i -> System.out.println(i));
// second way to print loop
        System.out.println("second Way");
        list.stream().forEach(System.out::println);

    }
}
