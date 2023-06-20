package ex14;

public class Thread01 {

    // 자바는 CPU가 하나의 스레드를 생성하여 실행한다.
    // 실==main 메서드
    public static void main(String[] args) {

        new Thread(() -> {
            // 여기다가 코드 많이 적으면 한가닥 나온 스레드 길이가 길어짐

            for (int i = 0; i < 5; i++) {
                System.out.println("서브스레드:" + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

            }
        }).start();
        // 스레드 하나 더 만듬
        // 스레드는 하나의 실

        for (int i = 0; i < 5; i++) {
            System.out.println("메인스레드:" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }

}
