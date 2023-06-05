package Seal01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // 정수 넣는 스캐너
        // 팩토리얼 계산하는 For문

        System.out.println("정수를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long fact = 1;// 팩토리얼은 정수를 모두 곱하는 것이기 때문에 초기값은 1로 둔다.

        for (int n = 1; n <= i; n = n + 1) {

            fact = fact * i;
        }

        System.out.println(i + "!은 " + fact + "입니다.");
        // 왜 음수로 나옴 ㅠ

    }

}
