package day3;

public class ParameterExam1 {
    public static void print(int num){
        System.out.println(num);
    }
    public static void introduce(int i){
        for(int a = 0; a < i; a++)
        System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
    }

    public static void greeting1(int a){
        if(a == 1){
            System.out.println("안녕하세요.");
        }
        else if(a == 2){
            System.out.println("하이~");
        }
        else if(a == 3){
            System.out.println("봉쥬");
        }
    }

    public static void main(String[] args) {

        print(4);
        print(10);
        print(100);

        introduce(15);
        // 안녕하세요. 저는 20살 홍길동입니다.! x i
        greeting1(2);

    }
}
