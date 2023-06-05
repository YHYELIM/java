package Seal01;

import java.util.Random;
import java.util.Scanner;

public class Ss02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위(0),바위(1),보(2):");
        int user = sc.nextInt();

        // 스캐너
        // 조건
        int com = (int) (Math.random() * 2);
        System.out.println("인간:" + user + "컴퓨터:" + com);
        if (user == com) {
            System.out.println("비김");
        } else if (user > com) {
            System.out.println("이김");
        } else {
            System.out.println("짐");
        }

    }

}
