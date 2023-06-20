package ex13;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vc = new Vector();// 벡터 객체 생성

        vc.add("Hello World!");
        vc.add(new Integer(10));
        vc.add(20);

        System.out.println("vector size: " + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("vector element" + i + ":" + vc.get(i));
        }
        String s = (String) vc.get(0);
        // get()은 Object타입으로 반환하므로 다운캐스팅해준다
    }

}
