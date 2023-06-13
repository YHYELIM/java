package ex05.ch05.composit2;

public class Fri {
    private int price;
    private String desc;

    public Fri() {
        this(1000, "프라이");

    }

    public Fri(int price) {
        this(1500, "프라이");
        System.out.println("프라이 나왔습니다");
    }

    public Fri(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
