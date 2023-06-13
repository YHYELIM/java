package ex06;

//1.인터페이스는 new할수없다
//2. 인터페이스는 변수를 만들수있다
//3. 인터페이스는 추상메서드만 가진다
interface Remote {
    int NUM = 10;// public static final이 생략
    // final변수는 무조건 대문자로 써야함

    void run();// public abstract

}

public class Inter01 {
    public static void main(String[] args) {
        System.out.println(Remote.NUM);

    }

}
