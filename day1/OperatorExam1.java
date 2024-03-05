package day1;

public class OperatorExam1 {
    public static void main(String[] args) {

        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓");
        }

        if ( a > 10 ) {
            System.out.println("거짓");
        }

        if ( a >= 10 ) {
            System.out.println("참");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참");

            boolean c = a != b; // false

            if ( c ) {
                System.out.println("거짓");
            }

            if ( c == false ) {
                System.out.println("참");
            }

            // `!` => 반전
            if ( !c ) {
                System.out.println("참");
            }

            // `!` => 반전
            if ( !(!c) ) {
                System.out.println("거짓");
            }

            boolean d = true;

            if ( c != d ) {
                System.out.println("참");
            }
        }
    }
}
