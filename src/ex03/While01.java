package ex03;

public class While01 {
    public static void main(String[] args) {
        // for 끝이 있는 반복문
        // while 끝을 모르는 반복문
        int i = 1;

        while (true) {
            if (i == 101) {
                break;// 100까지 나오게 하는 방법
                // 아래에 둬도 상관없지만 이런 조건은 위에 두는게 좋다
            }

            System.out.println("Hello World" + i);
            i++;// 이렇게 할거면 for 문이 낫다
        }

    }

}
