package programming_248;

class Shape {
    protected int x, y;

}

interface Drawable {
    void draw();

}

class Circle extends Shape implements Drawable {
    int radius;

    public void draw() {
        System.out.println();
    }// 상속과 동시에 인터페이스 구현 //일반적인 클래스 정의 형태

}

public class TestInterFa {
    public static void main(String[] args) {
        Drawable obj = new Circle();
        obj.draw();
    }

}
