package programming_248;

class Shape {
    protected int x, y;

    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape {
    private int width, height;

    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape {
    private int base, height;

    public void draw() {
        System.out.println("Triangle Draw");
    }
}

class Ciecle extends Shape {
    private int radius;

    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        // Shape s = new Shape();
        // s.draw();

        // Shape s1,s2;
        // s1=new Shape();
        // s2= new Rectangle();//shape타입의 변수이므로 Rectangle객체를 이용하지못함

        Shape s = new Rectangle();// 부모객체 가리킴
        Rectangle r = new Rectangle();
        s.x = 0;
        s.y = 0;
        // s.width=100; s를 통해서 Rectangle 클래스에 접근할수없다
        // s.height=100;

    }

}
