package ex03;

public class MyStar01 {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// System.out.println("*");
// System.out.println("**");
// System.out.println("***");
// System.out.println("****");
// System.out.println("*****");

// 차근차근
// 변수와 상수 구분
// 부분별로 따로 테스트 해보고 붙여보고
// 리팩토링 코드

// 최종 리팩토링 코드
// for (int k = 6; k < 6; k--) {
// for (int i = 6; i < k; i--) {
// System.out.print("*");
// }

// }
// System.out.println();

// System.out.println("*****");
// System.out.println("****");
// System.out.println("***");
// System.out.println("**");
// System.out.println("*");

// for (int k = 1; k < 6; k++) { // 행을 반복
// for (int i = 0; i < k; i++) {
// System.out.print("*");
// }
// System.out.println();
// }
// System.out.println("===========");

// System.out.println(" * ");// 같고
// System.out.println(" *** ");// 같고
// System.out.println(" ***** ");// 다르고
// System.out.println(" *** ");
// System.out.println(" * ");

// }
