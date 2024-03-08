package day3;

public class Parameter {
    public static void plus(int num1, int num2){// <== 매개변수(괄호안에 들어가는것)
        System.out.println(num1 + num2);
    }
    public static void multiple(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public static void main(String[] args) {
        // 함수 호출 -> 값(인자, argument)
        plus(45, 20); // 10+20이란 함수를 정의하였고 이를 사용하는 명령어.
        multiple(5, 35);

        // 인자의 개수와 매개변수의 개수는 일치해야 합니다.


    }
}
