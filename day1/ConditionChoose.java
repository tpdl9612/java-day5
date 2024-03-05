package day1;

public class ConditionChoose {
    public static void main(String[] args) {
        int weather = 3;
        if (weather == 1) {
            System.out.println("맑음 : 날씨가 맑습니다. 나들이 가세요.");
        }
        else if (weather == 2) {
            System.out.println("흐림 : 날씨가 흐립니다. 집에 계세요.");
        }
        else if (weather == 3) {
            System.out.println("비 : 날씨가 비옵니다. 우산을 챙기세요.");
        }
        else if (weather == 4) {
            System.out.println("눈 : 날씨가 눈옵니다. 눈사람을 만드세요");
        }
        else {
            System.out.println("잘못된 값입니다.");


        }
    }
}
