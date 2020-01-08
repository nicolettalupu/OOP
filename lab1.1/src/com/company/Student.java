package com.company;

public class Student {
    String name;
    int age;
    double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public double getMark() { return mark; }
}