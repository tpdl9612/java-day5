package day3;

public class ParameterExam2 {

//    public static int printEven(int number) {
//        for (int a = 2; a <= number; a++) {
//            if (a % 2 == 0) {
//                System.out.println(a);
//            }
//        }
//        return number;
//    }
    public static boolean isNegative(int number){
        return number < 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {

        // 0은 양수로 보겠습니다.
        int no = -1;

        if(isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.
        //1 부터 n까지의 수 중 짝수만 출력.
        printEven(10); // 출력: 2 4 6 8 10
        System.out.println();
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        System.out.println();
        printEven(5); // 출력: 2 4



    }
}

