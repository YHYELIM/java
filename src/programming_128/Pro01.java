package programming_128;

import java.util.Scanner;

public class Pro01 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        // if 반복문 사용

        if (i == 1) {
            System.out.println("ONE");
        } else if (i == 2) {
            System.out.println("TWO");
        } else if (i == 3) {
            System.out.println("THREE");

        } else {
            System.out.println("OTHER");

        }
    }

}
