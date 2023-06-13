package ex05.ch05.composit2;

public class BigHotDog extends HotDog {// 빅핫도그야 너 핫도그니?ㅇㅇ
    private int price;
    private String desc;

    public BigHotDog() {
        this(3500, "빅핫도그");

    }

    public BigHotDog(int price) {
        this(3000, "할인된 빅핫도그입니다");
        System.out.println(price + "원 입니다" + " " + desc);
    }

    public BigHotDog(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("빅핫도그가 만들어졌습니다.");

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
