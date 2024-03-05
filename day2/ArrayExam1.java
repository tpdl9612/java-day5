package day2;

public class ArrayExam1 {
    public static void main(String[] args) {
////         arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
//
//        int num[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//
//        for(int a = 0; a < num.length; a++){
//            System.out.println(num[a]);
//        }
        // 배열의 모든 요소를 세번 출력해주세요.
//        int[] arr = {1,2,3,4,5};
//        int counting = 4;
//        // int arr[] = {1,2,3,4,5};
//        for(int a = 0; a < counting; a++){
//            for(int i = 0; i < arr.length; i++){
//                System.out.println(arr[i] + " ");
//            }
//            System.out.println();
//        }
//        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
//
//        for(int rec = arr.length; rec == 0; rec--){
//            System.out.println(arr[rec-1]);
//        }
//        System.out.println();

        // 배열 안의 숫자들의 합을 구해주세요.
        int sum = 0;
        int[] arr = {10, 20, 30, 40, 50};
		for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("배열안의 숫자들의 합 :" + sum);
		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/






    }
}
