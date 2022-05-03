package com.java8;

import java.util.Comparator;

public class DesSalaryComparator implements Comparator<Java8> {
    @Override
    public int compare(Java8 o1, Java8 o2) {
        Double salary1 = o1.getSalary();
        Double salary2 = o2.getSalary();
        return -salary1.compareTo(salary2);
    }
}
