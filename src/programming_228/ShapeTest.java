package programming_228;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Ciecle extends Shape {
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }

}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle을 그립니다.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();

    }

}
