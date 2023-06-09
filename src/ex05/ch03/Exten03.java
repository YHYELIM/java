package ex05.ch03;

abstract class Animal {// 추상 클래스
    abstract void speak();// 추상메서드(구체적 행위를 알지못할때)
    // 이게 오버라이드
}

class Bird extends Animal {

    @Override
    void speak() {
        // TODO Auto-generated method stub
        System.out.println("짹짹");

    }

}

class Cow extends Animal {

    @Override // 오버라이드 아님 재정의 //부모메서드 오버라이드 됐어 라는 뜻
    void speak() {
        // TODO Auto-generated method stub
        System.out.println("음메");
    }// 구체적인 클래스는 추상클래스를 상속받을때 추상 클래스의 행위를 적어줘야함

}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }

}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }

}

public class Exten03 {

    static void start(Animal u) {
        u.speak();// animal의 speak

    }

    public static void main(String[] args) {

        Animal d = new Dog();
        start(d);
        Animal c = new Cat();
        start(c);
    }

}
