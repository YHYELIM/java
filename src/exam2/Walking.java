package exam2;

public class Walking {
    public static void main(String[] args) {
        /* 1. 칼로리 계산을 위해 메소드를 호출하시오. */
        double result = calculateCalory(5000);// 우변실행할때 12번으로 점프
        /* 3. 결과를 출력하시오. */
    }

    /* 2. 칼로리 계산 메소드를 정의하시오. */
    private static int calculateCalory(int walk) {
        return (int) (0.02 * walk);
    }
}
