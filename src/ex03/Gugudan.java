package ex03;

public class Gugudan {
    public static void main(String[] args) {
        // 2*1=1,엔터 2*=4...형태로
        // 노가다 해보고 패턴보고

        // 클라이언트가 구구단 5단 까지 요구
        int n = 2;

        System.out.println(n + "*1=2");
        System.out.println(n + "*2=4");
        System.out.println(n + "*3=6");
        System.out.println(n + "*4=8");
        System.out.println(n + "*5=9");
        System.out.println(n + "*6=12");
        System.out.println(n + "*7=14");
        System.out.println(n + "*8=16");
        System.out.println(n + "*9=18");
        System.out.println();

        n = n + 1;

        System.out.println(n + "*1=3");
        System.out.println(n + "*2=6");
        System.out.println(n + "*3=9");
        System.out.println(n + "*4=12");
        System.out.println(n + "*5=15");
        System.out.println(n + "*6=18");
        System.out.println(n + "*7=21");
        System.out.println(n + "*8=24");
        System.out.println(n + "*9=27");
        System.out.println();

        n = n + 1;
        System.out.println(n + "*1=4");
        System.out.println(n + "*2=8");
        System.out.println(n + "*3=12");
        System.out.println(n + "*4=16");
        System.out.println(n + "*5=20");
        System.out.println(n + "*6=24");
        System.out.println(n + "*7=28");
        System.out.println(n + "*8=32");
        System.out.println(n + "*9=36");
        System.out.println();

        n = n + 1;
        System.out.println(n + "*1=5");
        System.out.println(n + "*2=10");
        System.out.println(n + "*3=15");
        System.out.println(n + "*4=20");
        System.out.println(n + "*5=25");
        System.out.println(n + "*6=30");
        System.out.println(n + "*7=35");
        System.out.println(n + "*8=40");
        System.out.println(n + "*9=45");
        System.out.println();

        System.out.println(n + "*");
        System.out.println(n + "*1=2");
        System.out.println(n + "*2=4");
        System.out.println(n + "*3=6");
        System.out.println(n + "*4=8");
        System.out.println(n + "*5=9");
        System.out.println(n + "*6=12");
        System.out.println(n + "*7=14");
        System.out.println(n + "*8=16");
        System.out.println(n + "*9=18");
        System.out.println();
        // 1단계

        int nn = 2;

        System.out.println(nn + "*1=" + (n * 1));
        System.out.println(nn + "*2=" + (n * 2));
        System.out.println(nn + "*3=" + (n * 3));
        System.out.println(nn + "*4=" + (n * 4));
        System.out.println(nn + "*5=" + (n * 5));
        System.out.println(nn + "*6=" + (n * 6));
        System.out.println(nn + "*7=" + (n * 7));
        System.out.println(nn + "*8=" + (n * 8));
        System.out.println(nn + "*9=" + (n * 9));

        for (int k = 2; k < 10; k = k + 1) {

            System.out.println(k + "*1=" + (k * 1));
            System.out.println(k + "*2=" + (k * 2));
            System.out.println(k + "*3=" + (k * 3));
            System.out.println(k + "*4=" + (k * 4));
            System.out.println(k + "*5=" + (k * 5));
            System.out.println(k + "*6=" + (k * 6));
            System.out.println(k + "*7=" + (k * 7));
            System.out.println(k + "*8=" + (k * 8));
            System.out.println(k + "*9=" + (k * 9));
            System.out.println();
        }

    }

}
