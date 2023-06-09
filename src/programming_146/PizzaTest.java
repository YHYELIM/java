package programming_146;

//피자에 대한 클래스
class Pizza {
    int radius;

    Pizza(int r) {
        radius = r;
    }

    // p1과p2 비교
    // if문 사용
    Pizza whosLargest(Pizza p1, Pizza p2) {
        if (p1.radius > p2.radius)
            return p1;
        else
            return p2;

    }

}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza(14); // 힙 피자 불러오고
        Pizza obj2 = new Pizza(18);

        Pizza largest = obj1.whosLargest(obj1, obj2); // whosLargest 메서드 가서 인치 비교
        System.out.println(largest.radius + "인치 피자가 더 큼.");

    }

}
