package ex05.ch05.composit2;

public class HotDog {
    private int pirce;
    private String desc;// 객체 상태...1

    public HotDog() {
        this(3000, "핫도그");

    }

    public HotDog(int price) {
        this(2000, "할인된 핫도그입니다.");
        System.out.println(price + "원 입니다." + desc);
    }

    public HotDog(int pirce, String desc) {// 객체 행위(메서드-객체 상태를 변경시킴)...3 -int로 price받을거고 string으로 desc 받을거
        this.pirce = pirce;// 여기서 this는 나 자신의 힙을 가리킴
        this.desc = desc;
        System.out.println("핫도그가 만들어졌습니다.");// 출력을 해야 나오지

    }

    public int getPirce() {
        return pirce;
    }

    public String getDesc() {
        return desc;
    }

    public void setPirce(int pirce) {
        this.pirce = pirce;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    // getter, setter를 만든다...2

}
