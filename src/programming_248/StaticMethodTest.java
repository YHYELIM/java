package programming_248;

interface Employee {
    String getName();

    static boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        } else {
            return false;
        }
    }
}// 이름을 검사하는 유틸리티 메소드를 만들어서 인터페이스 안에 정적 메소드로 추가할 수 있다.

class Employee implements Employable {
    private String name;

    public Employee(String name) {
        if (Employable.isEmpty(name) == true) // 정적메소드 호출
            throw new RuntimeException("이름을 반드시 입력해야 함!");
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

}

public class StaticMethodTest {

    public static void main(String[] args) {
        // Employable employee = new Employee("홍길동") {

    };

}
