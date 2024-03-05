package day2;

public class LoopExam1 {
    public static void main(String[] args) {

        //1부터 100까지
//        for(int i = 0; i <=100; i++){
//            System.out.println(i);
//        }
//        int i = 1;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }
//         문제1. 1 ~ 100까지 수중 짝수만 출력
//        for(int i = 2; i<= 100; i+=2){
//            System.out.println(i);
//        }
//        while(i <= 100){
//            if(i % 2 ==0){
//                System.out.println(i);
//            }i++;
//        }

        // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
//        1:odd
//        2:even
//        3:odd
        // =============for문============================================
//        for (int i = 1; i <= 100; i++){
//            if(i % 2 ==0){
//                System.out.println(i+":even");
//            }else System.out.println(i+":odd");
//        }

        // =========== while문 =========================================

//        int i = 1;
//        while(i <= 100){
//            if (i % 2 == 0){
//                System.out.println(i+":even");
//            }else System.out.println(i+":odd");
//            i++;
//        }
// 1. 응용 구구단.
// 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수
        for(int a = n; a < m; a++){
            if(a % 2 == 1){
                for(int i = 1; i <= limit; i++)
                    if(i % 2 == 0){
                        System.out.println(a+"x"+i+"="+a*i);
                    }
            }
        }
        System.out.println();
    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */

    }
}
