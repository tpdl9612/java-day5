package day1;

public class VariableExam1 {
    public static void main(String[] args) {
        int i = 100;
        double d = 3.14;
        String s = "안녕하세요";
        System.out.println(i); // 출력 : 100
        System.out.println(d); // 출력 : 3.14
        System.out.println(s); // 출력 : 안녕하세요
        i = 200;
        d = 10.5;
        s = "반갑습니다.";
        System.out.println(i); // 출력 : 200
        System.out.println(d); // 출력 : 10.5
        System.out.println(s); // 출력 : 반갑습니다.

        int a = 0;
        int c = a;
        int b = 0;
        a = b;
        b = c;

        a = 10;
        b = 15;
        c = a;
        System.out.println(a + b);
        System.out.println(b + c);

    }
}
