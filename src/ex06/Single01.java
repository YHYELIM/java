package ex06;

class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성되었습니다.");
    }
}

class 바론 {
    private static 바론 instance = new 바론();// static이니까 첨 부터 떠있음

    public static 바론 getInstance() {
        return instance;
        // static이니까 첨 부터 떠있음

    }

    private 바론() {
    }
}// instance 있으면 싱글톤: 이 객체는 하나만 유지해야하는 객체구나
 // 바론 특징: 하나만 존재,게임 시작하고 20분 있다가 뜸

public class Single01 {
    public static void main(String[] args) {
        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();
        // new 바론(); private이라서 접근 못함

        System.out.println(m1.hashCode());

        바론 b1 = 바론.getInstance();
        바론 b2 = 바론.getInstance();

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        if (b1 instanceof 바론) {// b1과 바론은 같은 타입인가요 확인
            System.out.println("같은 타입 입니다.");

        }
        if (b1 instanceof Object) {
            System.out.println("바론과 오브젝트는 같은 타입입니다.");
        } // new 할수있는 모든 클래스의 부모가 Object
        String str = "안녕";
        Object obj = str;// 묵시적 형변환

    }

}
