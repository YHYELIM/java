package ex05.exam;

abstract class 육식동물 {
    abstract void print();
}

class Tiger extends 육식동물 {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

class Lion extends 육식동물 {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

public class ExtenExam {

    static void start(육식동물 u) {

        u.print();

    }

    public static void main(String[] args) {
        육식동물 lion = new Lion("사자1");
        start(lion);
        육식동물 tiger = new Tiger("호랑이");
        start(tiger);

    }

}
