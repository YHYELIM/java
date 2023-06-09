package programming_248;

class Parent {
    void print() {
        System.out.println("Parent 메소드 호출");
    }
}

class Child extends Parent {

    @Override
    void print() {
        System.out.println("Child 메소드 호출");
        // TODO Auto-generated method stub
        print();
    }

}

public class Casting {
    public static void main(String[] args) {
        Parent p = new Child();// 업캐스팅:자식객체를 부모개체로 형변환
        p.print();// 동적 메소드 호출, 자식의 print()호출

        // Child c= new Parent();// 자식안에 부모를 넣을 수 없다

        Child c = (Child) p;// 다운캐스팅: 부모 객체를 자식으로 형변환
        c.print();// 메소드 오버라이딩, 자식 객체의 print()호출

    }

}
