package programming_228;

//shape 클래스 만들기
class Shape {
    int x, y;
}

// shape을 상속받은 circle
class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
        x = 0;
        y = 0;

    }

    double getArea() {
        return 3.14 * radius * radius;

    }

}

public class CircleTest {
    public static void main(String[] args) {
        Circle obj = new Circle(10);
        System.out.println("원의 중심:(" + obj.x + "," + obj.y + ")");
        System.out.println("원의 면적:" + obj.getArea());
    }

}
