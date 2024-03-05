package day2;

public class Loop {
    public static void main(String[] args) {
        // 반복문을 이용해 동일한 명령을 여러번 실행
        // while 은 실행후에 무한반복, 반복은 제어가 중요


// 원하는 만큼만 반복
//        int cnt = 0; // 반복횟수 세는 용도 cnt:0
//
//        while (cnt <= 5) {
//            System.out.println(cnt);
//            cnt++; // 1씩증
//        }
//        for (int cnt2 = 0; cnt2 <=5; cnt2++){
//            System.out.println(cnt2);

        // ===== 1씩 증가할때만 count++


        // for문(변수 = 0;(초깃값) 변수 <= 최댓값; 단계값++){
        // System.out.println(내용);
        // }


        //1부터 10까지 짝수출력 v1
        for (int i = 2; i <=10; i+=2){
            System.out.println("ver1==="+i);
        }
        //1부터 10까지 짝수출력 v2
        for (int i = 1; i <=10; i++){
            if(i % 2 == 0){
                System.out.println("ver2==="+i);
            }
        } // % 나눈 나머지 구하는연산자
        // 짝수 a % 2 == 0 , 홀수 a % 2 == 1

    }
}