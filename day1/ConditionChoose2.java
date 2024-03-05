package day1;

public class ConditionChoose2 {
    public static void main(String[] args) {
        // else if 를 사용하면 연산상의 효율성과 조건식의 간결함을 얻을 수 있다.
        int age = 20;
        if(age < 14 && age > 6){
            System.out.println("초등학생입니다.");
        }
        else if(age < 7){
            System.out.println("어린이입니다.");
        }
        else if(age < 17){
            System.out.println("중학생입니다.");
        }
        else if(age <20){
            System.out.println("고등학생입니다.");
        }else {
            System.out.println("성인입니다.");
        }
    }
}
