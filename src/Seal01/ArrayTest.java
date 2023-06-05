package Seal01;

public class ArrayTest {// 배열
    public static void main(String[] args) {
        int[] s = new int[10];
        // 연속된 int 타입 10 공간 확보

        for (int i = 0; i < s.length; i++) {
            s[i] = i;

        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i] + "");
        }

    }

}
