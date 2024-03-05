package day1;

public class Variable {

    public static void main(String[] args){
        //변수
        int a = 20;
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
    //string = 자바에서 문자열을 의미
        String name = "홍길동";
        System.out.println(name);
        // 자기소개 10번출력
        int age = 21;
        System.out.println("안녕하세요. 저는"+name+"입니다. 나이는"+age+"입니다.");
        System.out.println("안녕하세요. 저는"+name+"입니다. 나이는"+(age+1)+"입니다.");

        age = 25;
        System.out.println("저의나이는"+age+"입니다.");
    // 변수 주의사항
//        변수명은 중복되지 않도록 지어야한다.
//        변수명은 숫자로 시작하면 안된다 (뒤에 오는건 가능함)
//        변수는 재활용 가능하다.


    }
}
