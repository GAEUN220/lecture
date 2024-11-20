package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.maxSpeed = 100; // 이 코드는 실질적으로 'Person.maxSpeed = 100;'으로 처리됨
        Person p2 = new Person();
        p2.maxSpeed = 200;
        Person p3 = new Person();
        p3.maxSpeed = 300; // 따라서 마지막 저장값이 프린트 됨

        System.out.println(p1.maxSpeed); // 이 코드는 실질적으로 'System.out.println(Person.maxSpeed);'와 같음
        System.out.println(p2.maxSpeed);
        System.out.println(p3.maxSpeed);
    }
}

class Person {
    static int maxSpeed; // 왜냐? static이기 때문에 각각의 개체에 maxSpeed 변수가 존재 X
}