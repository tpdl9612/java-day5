package day3;

public class LocalAndClassVariable {
    public static int test() {
        int num = 10;

        return num;
    }
    public static void main(String[] args) {
        int num = test();
        System.out.println(num);
        Person p1 = new Person();

        p1.age = 18;
        p1.name = "홍길동";
        p1.home = "서울";

        p1.introduce();
        p1.addAge();
        p1.introduce();

//        Person.introduce(); // 20살, 클래스로 바로 만들어서 사용할수 없다.
//        Person.addAge();      +1살
//        Person.introduce();   21살

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";
        p2.home = "부산";

        p2.introduce();
        p2.addAge();
        p2.introduce();

        Person.averageAge = 31;

        p1.introduce();



    }
}
