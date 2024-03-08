package day4;

public class Composition {
    public static void main(String[] args) {
// . 왼쪽은 객체, 오른쪽것을 포함하고있다.
        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.파이썬();

        a홍길동.파이썬();

        홍길동 이순신주식회사 = new 홍길동();
        이순신주식회사.자바();
        이순신주식회사.파이썬();

        이순신주식회사.파이썬(); // 파이썬 3.12 프로그래밍
        이순신주식회사.자바(); // 자바 17버전 프로그래밍
    }
}

class 홍길동 extends 홍길순 {

    홍길순 a홍길순 = new 홍길순();

    public void 자바() {
        System.out.println("자바 17버전 프로그래밍");
    }

    public void 파이썬() {
        a홍길순.파이썬();
    }
}

class 홍길순 {

    홍길동 a홍길동 = new 홍길동();

    홍길순 a홍길순 = new 홍길순();
    public void 파이썬() {
        System.out.println("파이썬 3.12 프로그래밍");
    }
}
class 이순신주식회사 extends 홍길순{}