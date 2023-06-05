package ex04;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.println("획득 금액:$%.2f(%0f원)." + dollar + won);

    }

    public static int dice() {
        // 랜덤 이용해서 1-6까지 출력
        int n1 = (int) (Math.random() * 6) + 1;
        System.out.println(n1);

        return n1;
    }

    public static double exchange(double dollar) {
        // 입력받은 달러를 환전하여 반환
        // double dollar =double won*1200 환전 구하는 식

        return dollar * 1200;
    }

}
