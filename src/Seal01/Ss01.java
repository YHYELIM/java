package Seal01;

import java.util.Scanner;

public class Ss01 {
    public static void main(String[] args) {
        // 성적 입력

        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하시오:");
        grade = sc.nextInt();

        // 조건
        if (grade >= 90) {
            System.out.println("A학점입니다.");

        } else if (grade >= 80) {
            System.out.println("B학점입니다");
        } else if (grade >= 70) {
            System.out.println("C학점입니다");
        }

    }

}
