package ex05.composit;

public class BigBurger extends Burger {
    // 상속의주목적은 추상화 (타입 일치 시킨다-부모를 바라볼수 있음)
    // 물려받는건 부가효과 재산을 물려 받으려고 상속 쓰면 안됨
    public BigBurger() {
        super(1500, "빅버거");
        System.out.println("빅버거가 만들어졌습니다.");
    }

    public BigBurger(int price) {
        super(1500);
        System.out.println("빅버거가 만들어졌습니다.");
    }

    public BigBurger(int price, String desc) {
        super(price, desc);
        System.out.println("빅버거가 만들어졌습니다.");
    }

}
