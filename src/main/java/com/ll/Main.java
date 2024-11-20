package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        자동차 a자동차;
        a자동차 = new 자동차();
        a자동차.달리다();
        a자동차.정지하다();
    }
}

class 자동차 {
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }

    void 정지하다() {
        System.out.println("자동차가 정지합니다.");
    }
}