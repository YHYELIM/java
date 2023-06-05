package ex04;

public class Gasoline {
    public static void main(String[] args) {// 힙에 뜸
        double gasoline = 8.86;
        double distance = 182.186;
        double efficiency = calcEfficiency(gasoline, distance);
        System.out.println("연비:%.2fkm/L" + efficiency);

    }

    public static double calcEfficiency(double fuel, double distance) {

        double calcEfficiency = distance / fuel;
        // 연비 구하는 식

        return 0;// 스택이니까 값 안사라지게 하려고return 사용

    }

}
