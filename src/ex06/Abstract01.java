package ex06;

//1.추상클래스는 new  할 수없다.
//2.추상클래스는 일반 메서드와 추상메서드를 가질수있다. 
//3.추상 클래스는 상태변수를 가질수있다.
abstract class 동물 {

    String name;

    public void run() {
        System.out.println("달린다");
    }

    public abstract void speak();
}

class 사자 extends 동물 {

    @Override
    public void speak() {
        System.out.println("어흥");// 부모의 메서드를 떄리면 자식의 메서드가 실행됨

    }
}

class 호랑이 extends 동물 {

    @Override
    public void speak() {
        System.out.println("으르렁");

    }

}

public class Abstract01 {
    public static void main(String[] args) {
        동물 a1 = new 사자();
        a1.run();
        a1.speak();

        동물 a2 = new 호랑이();
        a2.run();
        a2.speak();

    }

}
