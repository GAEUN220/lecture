package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.공격("브라이언", "칼");
        a전사.재공격();
        a전사.공격("필립", "창");
        a전사.공격("마크", "지팡이");
        a전사.재공격();
        a전사.재공격();
    }
}

class 전사 {
    String 공격자;
    String 무기;

    void 공격(String 공격자, String 무기) {
        this.공격자 = 공격자; //여기서 공격자는 브라이언, 필립, 마크가 됨 변수가 아님
        this.무기 = 무기; //여기서 this 빼면 공격()함수 안의 공격자가 됨 밖에 있는 거를 호출하기 위해 this 쓴거임

        재공격();
    }
    void 재공격() {
        System.out.printf("%s(이)가 %s(으)로 공격합니다.\n", 공격자, 무기);
    }
}