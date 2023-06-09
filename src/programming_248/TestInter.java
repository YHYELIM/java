package programming_248;

interface Remotecontrol {
    void turnOn();

    void turnOff();

    public default void printBrand() {
        System.out.println("RemoteControl 가능 Tv");
    }
}

class Television implements Remotecontrol {
    boolean on;

    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");

    }

    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    @Override
    public void printBrand() {
        // TODO Auto-generated method stub
        System.out.println("Power Java TV 입니다.");
    }
}

public class TestInter {
    public static void main(String[] args) {
        Remotecontrol obj = new Television();
        obj.turnOn();
        obj.turnOff();
        obj.printBrand();

    }

}
