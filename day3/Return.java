package day3;

public class Return {

    public static void plus(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static double circlearea(int radius) {
//        System.out.println(radius * radius * 3.14);
        return radius * radius * 3.14; // 원의 넓이를 반환
    }
    public static void main(String[] args) {
        circlearea(5);
        circlearea(10);


        double area1 = circlearea(5);;  // 반지름이 5인 원의 넓이
        double area2 = circlearea(10);  // 반지름이 10인 원의 넓이
//        System.out.println("반지름이 5인 원의 넓이 : " + area1);
//        System.out.println("반지름이 10인 원의 넓이 : "+ area2);
        //반지름이 5인 원의 넓이를 3,2로 나눈 값
        System.out.println(area1 / 3);
        System.out.println(area1 / 2);
        //함수끼리는 서로 호출하고 호출 당하는 관계
        // 함수가 자신을 호출한 쪽으로 값을 전달하는 것이 출력(리턴값)
        // 함수의 결과값을 이용해 2차 작업을 하기 위해서는 함수의 전달값을 받아서 사용할 수 있어야 한다.
        // 함수의 전달값은 return을 이용해 전달한다.


    }
}
