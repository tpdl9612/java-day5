package day2;

public class IncDecOperator {
    public static void main(String[] args) {
        // ==================================================================================================
        // 증감연산자

        int num = 10;
        System.out.println(num+5); // 15
        System.out.println(num);   // 10

        // 변수의 값을 5증가 시키고 싶다.
//        num = num + 5;    ,    num +=5
//        두 num 값은 같다.(증감연산자) +=
        num += 5;
        System.out.println(num);   // 15

        // ==================================================================================================
        num = 10;
        num +=1; // 증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num++;

        num -=1; // -1
        num --;  // -1
        System.out.println(num); // 10


    }
}
