package ex03;

import java.util.Scanner;

public class Coin {// 자바는 클래스 밖에는 아무것도 둘수 없다. 클래스는 둘수있다. 클래스 안에는 모든것을 둘수있음
    // void printRestMoney :행위 (모듈화된) stack에 안뜸 heap에 뜸
    // static 안붙어 있으니까 메모리에 안뜸 붙어있으면 new없어도 실행 가능
    // static안에는 heap변수를 넣을수없다
    //
    public static void main(String[] args) {

        System.out.println("금액:");
        Scanner sc = new Scanner(System.in);
        final int money = sc.nextInt();
        // scanner 로 수정하기
        int restMoney = money; // 남은 금액 변수 만들기s
        int count; // 동전 개수를 담을 변수
        int[] tempMoney = { 500, 100, 50, 10 };
        for (int i = 0; i < tempMoney.length; i++) {
            count = (restMoney / tempMoney[i]);
            restMoney = (restMoney % tempMoney[i]);
            System.out.println(tempMoney[i] + "원:" + count);

            // System.out.println(tempMoney[i] + " 원");
        }
        int[] Money = { 500, 100, 50, 10 };
        for (int m : tempMoney) {
            count = restMoney / m;
            System.out.println(m + "원:" + count);
            restMoney = restMoney % m;
        }

    }

}
