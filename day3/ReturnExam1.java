package day3;

import static day3.Carculator.*;

public class ReturnExam1 {
    public static int func1(){
        int a = 10;
        int b = 10;
        return a;
    }
    public static int func2(int i){
        return i;

    }
    public static int func3(int e){
        return e * e;
    }
    public static int func4(int i, int j){
        return i + j;
    }
    public static void main(String[] args) {
        int a = func1();
        System.out.println(a);
        // 출력 : 10
        int b = func1();
        System.out.println(b);
        // 출력 : 10

        int c = func2(22);
        System.out.println(c);
        // 출력 : 22

        int d = func2(55);
        System.out.println(d);
        // 출력 : 55

        int e = func3(10);
        System.out.println(e);
        // 출력 : 100
        int f = func3(5);
        System.out.println(f);
        // 출력 : 25

        int g = func4(10, 30);
        System.out.println(g);
        // 출력 : 40

        int h = func4(20, 50);
        System.out.println(h);
        // 출력 : 70
        int rst1 = plus(10, 20);
        System.out.println(rst1);  // 출력 : 30

        int rst2 = minus(10, 20);
        System.out.println(rst2); // 출력 : -10

        int rst3 = multiple(5, 4);
        System.out.println(rst3); // 출력 : 20

        int rst4 = divide(10, 3);
        System.out.println(rst4); // 출력 : 3

        int rst5 = square(5);
        System.out.println(rst5); // 출력 : 25



    }
}
