package com.ll;

import com.sun.source.doctree.SystemPropertyTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        표준Tv a표준Tv;

        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        a표준Tv.끄기();

        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        a표준Tv.끄기();

        a표준Tv = aLGTv;
        a표준Tv.켜기();
        a표준Tv.끄기();

        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();

    }
}

abstract class 표준Tv {
    abstract void 켜기();

    abstract void 끄기();
}


class 샤오미Tv extends 표준Tv {
    void 켜기() {
        System.out.println("샤오미Tv 켜집니다.");
    }

    void 끄기() {
        System.out.println(("샤오미Tv 꺼집니다."));
    }

    void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}

class 삼성Tv extends 표준Tv {
    void 켜기() {
        System.out.println("삼성Tv 켜집니다.");
    }

    void 끄기() {
        System.out.println(("삼성Tv 꺼집니다."));
    }

    void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv extends 표준Tv {
    void 켜기() {
        System.out.println("LGTv 켜집니다.");
    }

    void 끄기() {
        System.out.println(("LGTv 꺼집니다."));
    }

    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!!");
    }
}