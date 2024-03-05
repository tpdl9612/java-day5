package day1;

public class Print {
    public static void main(String[] args){
        System.out.println(100);
        System.out.println(200);
        System.out.println("홍길동");
        //엔터키 위 '역 슬래시'n 으로 줄나누기 가능, 반드시 쌍따옴표 "" 안에 있어야함.
        System.out.println("안녕하세요\n반갑습니다.");
        // 안녕하세요
        // 반갑습니다.

        //문자 합치기
        System.out.println("안녕하세요"+"홍길동입니다.");
        System.out.println("안녕하세요 홍길동입니다.");
        System.out.println("안녕하세요"+"저는"+ "홍길동입니다.");

        //숫자 합치기
        System.out.println(100+200);
        System.out.println(2000+3300);

        // 문자 + 숫자 -> 숫자를 문자화해서 붙임

        System.out.println(200+"100 100"+ 200);
        //출력문을 이용해 더하기 식 표현하기
        //+ 연산자가 여러번 나오면 왼쪽부터 순차적으로 연산 (+)
        System.out.println("123124 +  54563 = " + (123124 + 54563));

        System.out.println("2*1=2\n2*2=4\n2*3=6\n2*4=8\n2*5=10\n2*6=12\n2*7=14\n2*8=16\n2*9=18");
        System.out.println("2*1= " + (2 * 1) + "\n2 * 2 = " + (2*2));


    }
}
