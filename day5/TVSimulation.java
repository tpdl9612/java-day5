package day5;

public class TVSimulation {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();
        /* 객체 a객체 = new 객체;: 이 코드는 객체를 생성하고 변수 a객체가 그 객체를 참조하도록 하는 것입니다.
        이 코드를 통해 객체를 생성하고 해당 객체에 대한 참조를 변수에 할당합니다.
        객체 a객체;: 이 코드는 단순히 변수 a객체를 선언하는 것이지만 객체를 생성하는 부분이 빠져있습니다.
        이 변수는 아직 어떤 객체도 참조하지 않고 있으며, 나중에 객체를 할당하거나 초기화해야 합니다.
        따라서, 두 코드는 다른 의미를 갖습니다. 첫 번째 코드는 객체를 생성하고 변수에 할당하는 것이며,
        두 번째 코드는 객체를 생성하지 않고 단순히 변수를 선언하는 것입니다.
         */
        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 만든다.
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.


        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();
    }
}
// 추상클래스 : 객체화하여 사용할 수없다(단독으로 사용불가).
// 반드시 상속받아 오버라이딩 해서 사용해야 한다.
abstract class 표준Tv{ // 추상클래스
    abstract void 켜기();  // 추상메서드

    abstract void 끄기();

}
class 샤오미Tv extends 표준Tv { // 표준Tv 에게 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행 할 수 없음
    void 켜기() {
        System.out.println("샤오미Tv 켜집니다.");
    }

    void 끄기() {
        System.out.println("샤오미Tv 꺼집니다.");
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
        System.out.println("삼성Tv 꺼집니다.");
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
        System.out.println("LGTv 꺼집니다.");
    }

    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}