package programming_228;

abstract class Animal {
    int age;

    abstract void bark();

    void eat() {
        System.out.println("먹고있음..");
    }

}

class Cat extends Animal {
    void bark() {
        System.out.println("애옹");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("짖고있음..");
    }

}

public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        Cat c = new Cat();
        c.bark();
        c.eat();

    }

}
