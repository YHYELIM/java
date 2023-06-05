package programming_128;

import java.util.Scanner;

public class Pro02 {
    public static void main(String[] args) {

        System.out.println("연산자를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();

        System.out.println("피연산자 두개를 입력하세요:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result;

        if (i == "*") {
            result = (x * y);
            System.out.println(x + "*" + y + "=" + result);
        } else if (i == "/") {
            result = (x / y);
            System.out.println(x + "/" + y + "=" + result);
        } else if (i == "+") {
            result = (x + y);
            System.out.println(x + "+" + y + "=" + result);
        } else {
            result = (x - y);
            System.out.println(x + "-" + y + "=" + result);
        }

    }

}
