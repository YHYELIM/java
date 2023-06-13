package ex05.ch05.composit2;

public class App02 {
    public static void main(String[] args) {
        HotDogSet hs1 = new HotDogSet();
        hs1.getHotDog();
        hs1.getCoke();

        System.out.println("===============");

        Fri f1 = new Fri(3000);
        f1.getPrice();
        System.out.println("=================");

        Coke c1 = new Coke(2000, "코카콜라");
        c1.getDesc();
        c1.getPrice();

    }

}
