package ex05.ch05.composit2;

public class App01 {
    public static void main(String[] args) {
        // 핫도그 하나 주세요
        HotDog h1 = new HotDog();// HotDog 객체 생성 (힙에 뜬다)

        System.out.println("==============");

        // 빅핫도그 하나 주세요
        BigHotDog bh1 = new BigHotDog();// 빅핫도그 참조
        System.out.println("================");

        // 할인된 핫도그
        HotDog h2 = new HotDog(1500);// 핫도그 참조
        System.out.println("==================");

        // 할인된 빅핫도그
        BigHotDog bh2 = new BigHotDog(3000);
        System.out.println("=====================");

    }

}
