package ex05.composit;

public class Burger {// 상속 등 기본 문법 들어감 잘 정리하기
    private int price;
    private String desc;// 같은 클래스 외엔 접근 불가

    public Burger() {// new burger하면 호출됨
        this(1000, "버거");// 자기자신의 힙을 가리킴

    }// 디폴트값
     // 메서드: 객체의 상태를 변경시킴

    public Burger(int price) {// new burger하면 호출됨
        this(1000, "버거");// 자기자신의 힙을 가리킴

    }// 디폴트값

    public Burger(int price, String desc) {// construnct만들어 준다
        this.price = price;
        this.desc = desc;
        System.out.println("버거가 만들어졌습니다.");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
