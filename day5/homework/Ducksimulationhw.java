package day5.homework;

public class Ducksimulationhw {
    public static void main(String[] args) {

        청동오리 a청동오리 = new 청동오리();
        흰오리 a흰오리 = new 흰오리();
        고무오리 a고무오리 = new 고무오리();
        아수라오리 a아수라오리 = new 아수라오리();

        a청동오리.날다();
        a흰오리.날다();
        a고무오리.날다();
        a아수라오리.날다();
        System.out.println();

        a청동오리.헤엄치다();
        a흰오리.헤엄치다();
        a고무오리.헤엄치다();
        a아수라오리.헤엄치다();
        System.out.println("완료");


    }
}

abstract class 날개아이템{
    abstract void 사용();
}
abstract class 발아이템{
    abstract void 사용();
}

class 날개 extends 날개아이템{
    void 사용(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 고무날개 extends 날개아이템{
    void 사용(){
        System.out.println("고무날개로는 날 수 없습니다.");
    }
}
class 불사조날개 extends 날개아이템{
    void 사용(){
        System.out.println("불사조날개로 훨훨 날아갑니다.");
    }
}

class 발 extends 발아이템 {
    void 사용(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class 고무발 extends 발아이템 {
    void 사용(){
        System.out.println("고무발로는 헤엄칠 수 없습니다.");
    }
}

class 오리 {
    날개아이템 a날개 = new 날개();
    발아이템 a발 = new 발();
    void 날다(){
        a날개.사용();
    }
    void 헤엄치다(){
        a발.사용();
    }
}

class 청동오리 extends 오리{}
class 흰오리 extends 오리{}

class 고무오리 extends 오리{
    고무오리(){
        a발 = new 고무발();
        a날개 = new 고무날개();
    }
}

class 아수라오리 extends 오리{
    아수라오리(){
        a날개 = new 불사조날개();
    }
}