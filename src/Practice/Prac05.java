package Practice;

import java.util.Scanner;

public class Prac05 {
    public static void main(String[] args) {

        // 마일입력

        System.out.println("마일을 입력하시오:");
        Scanner sc = new Scanner(System.in);

        double mile = sc.nextDouble();

        // 계산
        double kilo = (mile * 1.609);
        System.out.println(mile + "마일은 " + kilo + "킬로미터 입니다.");

    }

}
