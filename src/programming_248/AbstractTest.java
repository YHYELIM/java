package programming_248;

abstract class Shape {
    int x, y;

    public void translater(int x, int y) {// 보통 메소드
        this.x = x;
        this.y = y;

    }// 추상클래스더라도 보통의 메소드를 가질수있음

    public abstract void draw();// 추상메소드 선언 abstract붙여줘야함
}

class Rectangle extends Shape {
    int width;
    int height;

    public void draw() {
        System.out.println("사각형 그리기 메소드");// 자식 Rectangle이 부모 Shape의 추상 메소드 구현
    }
}

class Ciecle extends Shape {
    int radius;

    public void draw() {
        System.out.println("원 그리기 메소드");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        // Shape s1= new shape(); //오류-> 추상클래스로 객체를 생성할수없다
        Shape s2 = new Ciecle();
        s2.draw();
    }

}
