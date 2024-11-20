package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.나이 = 40;
        p1.자기소개();

        Person.인류평균나이 = 37;
        Person.인류평균나이소개();
    }
}

class Person {
    int 나이;
    static int 인류평균나이;

    void 자기소개() {
        System.out.println("제 나이는 " + this.나이 + "살 입니다.");
    }
    static void 인류평균나이소개() {
        System.out.println("인류평균나이는 " + 인류평균나이 + "살 입니다.");
    }
}