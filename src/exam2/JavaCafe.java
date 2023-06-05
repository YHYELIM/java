package exam2;

import javax.xml.transform.Source;

public class JavaCafe {
    public static void main(String[] args) {
        // printPay(10.00, 40);
        // printPay(10.00, 50);
        // printPay(7.50, 38);
        // printPay(8.50, 66);
        printPay(10, 41);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력

    public static void printPay(double basePay, int hours) {
        if (basePay < 8) {
            System.out.println("최저시급에러");
            return;// 메서드 종료
        }
        if (hours > 60) {
            System.out.println("초과 근무시간 시 에러");
            return;
        }

        double pay = basePay * hours;// 10,41

        if (hours > 40) {
            pay = pay + (hours - 40) * (basePay * 0.5);

        }
        System.out.printf("$ %.2f\n", pay);
    }

    // 8달러 미만이면 경고문
    // 60시간 초과하면 경고문
    // 기본 시간 * 시간
    // 40시간 초과 처리하기
    // else안쓰는게 좋은 이유:모듈화시킬때 편함

}
