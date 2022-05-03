package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
    private String name;
    private int id;
    private String address;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Java8(String name, int id, String address, double salary) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Java8{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 7, 5, 9, 10);
        List<Java8> newList = Arrays.asList(
                new Java8("John",1,"USA", 12000),
                new Java8("Doe",2,"UK", 19000),
                new Java8("Amy",3,"SA", 20000),
                new Java8("Micheal",4,"GERMANY", 23400));
        System.out.println("Before:" + newList);
        System.out.println("--------------------");
        List<Java8> modifiedList = new ArrayList<>(newList);
        Collections.sort(modifiedList, new DesSalaryComparator());
        System.out.println("After:" + modifiedList);














        /*System.out.println(list);
        System.out.println("------------------------------");
        List<Integer> modList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(modList);
        modList.stream().forEach(s -> System.out.println(s));
        System.out.println("--------------------------------");
        List<Integer> newList = modList.stream().map(s -> s*s).collect(Collectors.toList());
        System.out.println(newList);*/
    }
}
