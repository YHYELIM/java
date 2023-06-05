package ex05.ch03;

class 동물 {
    // String print() {
    // return "동물";

    // }
    void speak() {
        System.out.println("1");
    }

}

class 사자 extends 동물 {
    String name = "사자";

    String print() {
        return name;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";

    void speak() {
        System.out.println("2");
    }
}

public class Exten02 {
    public static void main(String[] args) {
        동물 d = new 사자();
        동물 d1 = new 호랑이();
        동물 d3 = new 호랑이();

        d.speak();
        d1.speak();
        d3.speak();

        // System.out.println(d.print());
        // System.out.println(d1.print());
    }
}
// 오버라이드- 자식이 부모랑 동일한 메서드 이름 가지고 있으면 부모가 무효화