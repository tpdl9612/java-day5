package day3;

public class Cardrive {
    public static void main(String[] args) {

//        Car car = new Car();
//        for(int i = 1; i <= 3; i++){
//            car.drive();
//            if(i == 3){
//                car.stop();
//            }
//        }
        Car car1 = new Car();
        car1.Carname = "쏘렌토";
        car1.action = "달립";
        car1.limit = 220;
//        System.out.println(Carname+"가 최대속력"+limit+"로"+action+"니다.");
        car1.drivecar();

        Car car2 = new Car();
        car2.Carname = "그랜저";
        car2.action = "주행중멈춥";
        car2.limit = 250;

        car2.drivecar();


    }
}
;//public void cardrive(){
//    System.out.println(Carname+

class Car {
    String Carname;
    String action;
    int limit;
public void drivecar(){
    System.out.println(Carname+"가 최대속력"+limit+"로"+action+"니다.");
    }
//    public void drive(){
//        System.out.println("자동차가 주행중입니다.");
//    }
//    public void stop(){
//        System.out.println("자동차가 정지합니다.");
//    }
}