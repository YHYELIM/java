package exam2;

import javax.xml.transform.Source;

public class ExamTest {// 공식 눈으로만 보지말고 여기다가 실행해보면됨

    // static int dice() {
    // return (int) ((Math.random() * 2) + 1);
    // 매스 랜덤 double타입으로 나옴 그래서 int로 명시적 타입변환
    // 몇 번 해보기

    // public static void main(String[] args) {
    // // double result = 182.736 / 8.86;
    // // System.out.printf("%.2f", result);

    // // 요구 사항 분석
    // // 분석 하면서 무슨 문법을 모르겠는지 파악
    // int r1 = dice();
    // r1 = r1 + dice();
    // r1 = r1 + dice();
    // System.out.println(r1);

    // // 0.1,0.2,0.9*6(max)

    // // 작은 값으로 가정하고
    // }

    // 1. 요구사항
    // 체력 2500
    // 마력 1000
    // 안됨.

    // 체력 2300
    // 마력 2000
    // 됨.

    // 2. 순서도 그리기

    // 3. 프로그래밍
    // (1) int hp = 2300;
    // (2) int mp = 2000;
    // (3) if 조건문을 사용해서 hp와 mp가 2000 이상일 경우 "아이템 장착 완료!" 를 출력하라
    // // (4) if 조건문을 사용해서 hp와 mp 둘 중 하나라도 2000 미만일 경우 "아이템을 착용할 수 없습니다" 를 출력하라
    public static void main(String[] args) {

        int hp = 2300;
        int mp = 2000;
        if (hp >= 2000 && mp >= 2000) {
            System.out.println("아이템 장착 완료!");

        } else
            System.out.println("아이템을 착용할 수 없습니다.");

    }

}
