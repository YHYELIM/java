package ex03;

public class GugudanQuiz {
    public static void main(String[] args) {
        // int n = 2;
        // for (int k = 2; k < 10; k = k + 1) {

        // System.out.print(k + "*1=" + (k * 1) + ",");
        // System.out.print(k + "*2=" + (k * 2) + ",");
        // System.out.print(k + "*3=" + (k * 3) + ",");
        // System.out.print(k + "*4=" + (k * 4) + ",");
        // System.out.print(k + "*5=" + (k * 5) + ",");
        // System.out.print(k + "*6=" + (k * 6) + ",");
        // System.out.print(k + "*7=" + (k * 7) + ",");
        // System.out.print(k + "*8=" + (k * 8) + ",");
        // System.out.print(k + "*9=" + (k * 9));
        // System.out.println();
        // }

        // 변수 : *숫자
        int i = 0;
        i = i + 1;
        int k = 2;
        k = k + 1;
        // for문 이용
        for (k = 0; k < 10; k++) {
            for (i = 1; i < 10; i++) {

                System.out.print(k + "*" + i + "=" + (k * i) + ",");
                System.out.println();

            }
        }
        System.out.println();
        // 마지막 쉼표 어떻게 뺄지
    }
}
