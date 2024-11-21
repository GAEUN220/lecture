package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 = 22;
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 전사가 칼로 공격합니다.

        a전사.이름 = "초코";
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 전사가 활로 공격합니다.
    }
}

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 공격() {
        a무기.작동(이름, 나이);
    }

}

abstract class 무기 {
    abstract void 작동(String 사용자_이름, int 사용자_나이);
}

class 칼 extends 무기 {
    void 작동(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "가 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 작동(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "가 활로 공격합니다.");
    }
}