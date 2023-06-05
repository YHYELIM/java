package Seal01;

import java.util.Scanner;

public class SsGugudan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("구구단 :  ");
        int gu = sc.nextInt();

        for (int k = 2; k <= gu; k = k + 1) {
            System.out.println(k + "*1=" + (k * 1));
            System.out.println(k + "*2=" + (k * 2));
            System.out.println(k + "*3=" + (k * 3));
            System.out.println(k + "*4=" + (k * 4));
            System.out.println(k + "*5=" + (k * 5));
            System.out.println(k + "*6=" + (k * 6));
            System.out.println(k + "*6=" + (k * 6));
            System.out.println(k + "*7=" + (k * 7));
            System.out.println(k + "*8=" + (k * 8));
            System.out.println(k + "*9=" + (k * 9));
            System.out.println();

        }

        // 구구단 - for문
        // 입력값 - 스캐너
    }

}
