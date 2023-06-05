package Seal01;

public class Count_125 {
    public static void main(String[] args) {

        for (int i = 20; i < 60; i++) {

            System.out.println(i);
        }
        int x = (int) (Math.random() * 2);
        int y = (int) (Math.random() * 2);
        if (x > y) {
            int max = x;
            int min = y;
        } else {
            int min = x;
            int max = y;
            System.out.println("최대값:" + max + "최소값:" + min);

        }

    }

}
