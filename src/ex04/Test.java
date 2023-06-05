package ex04;

class A {
    private int a;
    int b;
    public int c;

}

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        // obj.a=10;프라이베이트는 같은 클래스 내에서만 접근이 가능하다
        obj.b = 20; // 디폴트는 접근가능
        obj.c = 30; // 퍼블릭도 접근가능
    }

}
