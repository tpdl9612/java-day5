package day4;

public class Inheritance {
    public static void main(String[] args) {
        // 상속 : 객체간 중복을 해결하고, 상속 관계 객체끼리 형변환 가능.
        // 계층 구조를 표현 할 수 있음.
        // 단점 : 잘못된 상속은 다른 객체에 큰 영향을 미침.
        //        코드가 복잡하고 커지면 중복을 해결X
        // 상속의 단점 보완 -> 구성(composition)
        // -> 객체를 사용해서 또 다른 객체를 만듦(다른 객체에 요청)
        /* 구성시 다양한 객체를 구성할 수 있는데 객체의 종류가 많아지면 객체를 저장하기 위한 변수가 많이필요.
        -> 비슷한 객체를 그룹화할 필요성이 있음.
        다양한 개체를 하나의 개념으로 보기 위해 형변환 활용. 개, 고양이, 기린, 사자 등의 객체를 동물이라는 하나의
        카테고리로 표현 가능. 필요에 따라 개를 개로 보거나 동물로 보거나 할 수 있음.

         */


        // ===================================================
        // 프로그래밍 -> 중복과의 싸움
        // 데이터의 중복 -> 변수
        // 코드의 중복 -> 함수
        // 변수/함수의 중복 -> 클래스, 객체
        // 객체의 중복 -> 상속

        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.meow();
        c1.breathe();


    }
}

class Animal {
    public void eat() {
        System.out.println("먹는다");
    }

    public void breathe() {
        System.out.println("숨을 쉰다~~!!");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍");
    }
}



class Cat extends Animal {
    public void meow() {
        System.out.println("야옹");
    }
}
