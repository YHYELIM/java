package ex04;

public class Walking {

    public static void main(String[] args) {
        // new 안써도 되는 이유: Calory에 static이 붙어서

        double result = calculateCalory(10000);

        // Walking myWalk = new Walking();

        // 칼로리 메소드 호출

        // 결과값 출력

    }

    // 칼로리 계산 메소드 정의
    private static double calculateCalory(int walk) {
        return 0.02 * walk;
        // 칼로리 메소드

    }

}
