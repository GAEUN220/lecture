package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다();
    }
}

class 동물 {
    void 숨쉬다() {
        System.out.println("숨쉬다!!");
    }
}

class 사람 extends 동물 {

}