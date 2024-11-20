package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.maxSpeed = 100;
        Person p2 = new Person();
        p2.maxSpeed = 200;
        Person p3 = new Person();
        p3.maxSpeed = 300;

        System.out.println(p1.maxSpeed);
        System.out.println(p2.maxSpeed);
        System.out.println(p3.maxSpeed);
    }
}

class Person {
    int maxSpeed;
}