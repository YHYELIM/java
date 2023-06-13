package programming_207;

class Single {
    private static Single instance = new Single();// static이니까 첨부터 떠있음

    private Single() {
    }// 전용생성자

    public static Single getInstance() {
        return instance;

    }
}

public class SingleTest {
    public static void main(String[] args) {
        Single obj1 = Single.getInstance();
        Single obj2 = Single.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);

    }

}
