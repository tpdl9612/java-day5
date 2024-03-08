package day3;

public class Person {

    // 변수 : 사물, 개념의 상태값
    // 함수 : 동작
    String name; // 8바이트 (글) , 4바이트 (숫자)
    int age = 20; // static : 함수가 공유하는 변수 - 클래스 변수
    String home; // 8바이트
public  void introduce() {
//        int age = 20;  // 지역변수  -- 주석처리로 age를 사용하지않을떄 바깥에있는 클래스함수 age를 찾아사용.
        System.out.println("안녕하세요 저는" + age + "살"+ name + "입니다.");
        System.out.println("인류 평균 나이는 "+ averageAge +"입니다.");
    }
    public void addAge(){
//        int age = 20;  // 지역변수
            age++;
    }
    // 인류 평균 나이 -> 모든사람이 공유하는 변수 -> 클래스 변수
    static int averageAge = 30; // 인류평균나이 30가정
    // static이 붙은것은 static이붙은것만 사용
    // 객체의 변수와 함수에는 특별한 이유가 없으면 static을 붙이지 않는다.
}
