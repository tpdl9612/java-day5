package day2;

public class Llop {
    public static void main(String[] args) {
//        int dan = 2; // 출력할 단
//        int repeatCount = 8; // 반복 횟수
//
//        for (int i = 1; i <= repeatCount; i++) {
//            int result = dan * i;
//            System.out.println(dan + " x " + i + " = " + result);
//        }
        // 2부터 9까지 구구단 출력

        for(int i = 2; i <= 9; i++){
            System.out.println(i+"단출력");
            for(int j = 1; j <=9; j++){

                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println();
        }



    }
}
