package day5;

public class ConstructorExam {
    public static void main(String[] args) {
        Person p1 = new Person(27, "홍길동"); // 사람이 태어납니다.
//        p1.age = 27;
//        p1.name = "홍길동";
        int age = 20;
        String name = "홍길동";
        // %d : 정수, %s : 문자열 , %f : 실수
        // printf완료시 항상줄바꿈 입력, 뒤에 줄붙여서나옴.
        System.out.println("안녕하세요"+age+"살입니다.");
        System.out.println("안녕하세요 "+age+"살입니다,"+" 이름은"+name+"입니다.");
        System.out.printf("안녕하세요 %d살입니다, 이름은 %s입니다.\n",age, name);
        Person p2 = new Person(25,"홍길순"); // 사람이 태어납니다.
//        p2.age = 25;
//        p2.name = "홍길순";

        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.

        Car c1 = new Car("소나타","하얀색", 100); // 자동차가 만들어집니다.
//        c1.model = "소나타";
//        c1.color = "하얀색";
//        c1.speed = 100;

        Car c2 = new Car("모닝","검정색",70); // 자동차가 만들어집니다.
//        c2.model = "모닝";
//        c2.color = "검정색";
//        c2.speed = 70;

        c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive(); // 검정색 모닝이/가 70km로 달립니다.
        // ==========================================================

        사람1 a사람 = new 사람1(10, 100);
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔(100);

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm

    }
}
class 팔 {
    int 길이;
    public 팔(int 길이){
        this.길이 = 길이;
    }
}
class 사람1{
    int 나이;
    팔 a왼팔;
    public 사람1(int 나이, int a왼팔){
        this.나이 = 나이;
        this.a왼팔 = new 팔(a왼팔);
    }
}

class Person {
    int age;
    String name;

    public Person(int age, String name){
        System.out.println("사람이 태어납니다.");
        this.age = age;
        this.name = name;
    }

    public void introduce(){
        System.out.println("안녕하세요"+ age +"살"+name+"입니다.");
    }
}
class Car{
    String model;
    String color;
    int speed;

    public Car(String 모델명, String 색깔, int 속도){
        System.out.println("자동차가 만들어집니다.");
        this.model = 모델명;
        this.color = 색깔;
        this.speed = 속도;
    }
    public void drive(){
        System.out.println(color+model+"이/가"+speed+"로 달립니다.");
    }
}