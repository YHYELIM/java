package programming_228;

//person 클래스
class Person {
    private String regumer;
    private double weight;
    protected int age;
    String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }
}

class Student extends Person {
    int id;
}

public class StudentTest {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.age = 21;
        obj.name = "Kim";
        obj.setWeight(75.0);
    }

}
