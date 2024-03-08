package day4;

class Duck {
     void 날다(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
    void 헤엄치다(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class 청둥오리 extends Duck {}
class 흰오리 extends Duck{}
class 고무오리 extends Duck{
    // 메소드 오버드라이브 (재정의) : 부모한테 물려받은 메서드와 동일한 이름의 메서드를 자식이 다시 정의
    // 자신에게 가까운 메서드를 우선적으로 사용.
void 날다(){
    System.out.println("저는 날 수 없어요. ㅜㅠ");
 }
 void 헤엄치다(){
     System.out.println("오리가 둥둥 떠다닙니다.");
 }
}
class 고무2오리 extends 고무오리{}

// 고무2오리의 메서드 개수 = 2개. 오리의날다, 고무오리의 날다.
class 아수라오리 extends 고무오리{
    void 날다(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}