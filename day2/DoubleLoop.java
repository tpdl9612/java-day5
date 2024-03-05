package day2;

public class DoubleLoop {
    public static void main(String[] args) {

//        for(int i = 0; i < 3; i++){
//            for(int j = 1; j <= 5; j++) {
//                System.out.println(j);
//            }
//        }

//        int dan = 3;
//        System.out.println("==="+dan + "단===");
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(dan + "x" + i +"="+ dan * i);
//        }

        // 1부터 9단까지의 구구단

//        for(int dan1 = 1; dan1 <=9; dan1++){
//            System.out.println("==" + dan1 + "단==");
//            for(int i = 1; i <=9; i++){
//                System.out.println(dan1 + "x" + i + "=" +dan1* i);
//            }
//        }
        int dan2 = 2;
        for(int j = 0; j < 8; j++){
            for (int i = 1; i <=9; i++){
                System.out.println(dan2 + "x" + i + " = " + (dan2 * i));
            }
        }

    }
}
