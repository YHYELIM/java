package Seal01;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("피자의 종류를 입력하시오: ");
        String model = sc.next();
        int price = 0;
        switch (model) {
            case "콤비네이션":
                price = 2000;
                break;
            case "슈퍼슈프림":
                price = 3000;
                break;
            case "포테이토":
                price = 4000;
                break;
            case "치즈":
                price = 5000;
                break;

        }

    }

}
