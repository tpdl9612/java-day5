package day2;

public class ObjectAndClass {
    public static void main(String[] args) {
        // Object 객체 -> 폴더
        // 사람표현 : 이름, 나이, 거주지 등등
        // 규모가 커지면 객체를 통해야 수월함, 변수로는 한계가 있음.
        // ex:) 사람 1명
//        String name = "홍길동";
//        int age = 20;
//        String home = "서울";
//        System.out.println(home + "사는"+age+"살"+ name +"입니다.");
//
//        // 사람 홍길동 복사
//        String name2 = name;
//        int age2 = age;
//        String home2 = home;

        // ==================================================
        // 이력서 개념, 원본복사(양식) 및 자기정보를 기입.
        // 복사 = new 원본이름();
       //원본 = 클래스 <==> 복사본 =객체, instence, object

        // 복사본에 홍길동의 정보를 기입
        Person p1 = new Person();
        p1.name = "홍길동"; // p1이란 이력서에 name정보를 기입
        p1.age = 20;
        p1.home = "서울";
        // 양식(클래스)이름 복사본 = new 양식(클래스)이름();
        Person p2 = new Person();
        //p1.name = "이순신"; (홍길동이름을 지우고 이순신으로작성)
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";
        //
        //홍길동 자기소개
        System.out.println(p1.home+"사는"+p1.age+"살"+p1.name+"입니다.");
        //이순신 자기소개
        System.out.println(p2.home+"사는"+p2.age+"살"+p2.name+"입니다.");
        // 복사
        Person p3 = p2;
        System.out.println(p3.name); // p2양식을 복사

        // ==========================================================================

        Car c1 = new Car();

        c1.name = "Sorrento";
        c1.price = 3000;
        c1.year = 2004;
        c1.value = "suv";

        Car c2 = new Car();
        c2.name = "Sm5";
        c2.value = "sedan";
        c2.year = 2010;
        c2.price = 1500;
        System.out.println("차이름은"+c1.name+"이고 가격은"+c1.price+"만원이며 생산년도는"+c1.year+
                "년이고 차종은"+c1.value+"입니다.");
        System.out.println("차명:"+c2.name+"  "+ "가격:"+c2.price+"만원\n"+"생산년도:"+c2.year+"  차종:"+c2.value);



    }
}


// 새로운 클래스 생성
class Person {
    String name;
    int age;
    String home;
} // ㄴ 사람이란 이름, 나이, 거주지로 묶여있는 개념이다. 라고선언

class Car {
    String name;
    int price;
    String value;
    int year;
}