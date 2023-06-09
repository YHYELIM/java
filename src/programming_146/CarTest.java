package programming_146;

class Car {
    String color;
    int speed;
    int gear;

    public String toString() {
        return "Car(color=" + color + "speed=" + speed + ",gear" + gear + ")";

    }

    void changeGear(int g) {
        gear = g;

    }

    void speedUp() {
        speed = speed + 10;
    }

    void speedDown() {
        speed = speed - 10;
    }

}

public class CarTest {
    public static void main(String[] args) {

        Car myCar = new Car(); // 힙에 뜬 Car를 부른다
        myCar.changeGear(1); // 변수이름. changeGear 메서드
        myCar.speedUp();
        System.out.println(myCar);

    }

}
// 자동차의 색, 스피드, 기어 요구사항
