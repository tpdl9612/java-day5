package day4;
//형변환
public class Casting {
    public static void main(String[] args) {
        // 자바의 대전제 -> 변수에는 오직 변수와 일치하는 타입의 값만 저장 가능.
        double b = 10; // 형변환o -> int가 double로 바뀜-> 자바가 바꿔줌(자동형변환)
        System.out.println(b);

        int c = (int)3.14; // 형변환 double이 int로 바뀌려면 소수점 떼야됨(수동변환)
        System.out.println(c);
        //객체타입형변환
        // 자바상속 -> 상위타입을 바탕으로 하위 타입 생성-> 동물을 바탕으로 고양이 생성
        // 상속관계에서 하위 타입은 상위타입으로 형변환 가능. 그 반대는 불가능

        Cat c1 = new Cat();
        c1.breathe(); // 숨쉬다

        Animal a1 = new Animal();
        a1.breathe();

        Animal a2 = c1; // 하위타입이 상위타입으로 모습을 바꾸는건 괜찮아서 자동 현변환이 일어남
        a2.breathe();
        a2.eat();
        
        a2 = new Dog();
        Cat c2 = (Cat)a2; // 수동형변환
        c2.meow();
//        Cat c2= a2; // 자동형변환X a2에는 Cat과 Dog가 들어있을 수 있기 떄문에 Cat이라고 확실할 수 없다.c
    }
}
