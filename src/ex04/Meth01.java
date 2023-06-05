package ex04;

//class만 작성 가능
class Cal01 {
    // 행위만 만들것이다
    void add() {
        System.out.println("add호출됨");// void:return 안함
    }// method의 제일 기본형

    void minus() {// 괄호 안은 동전 투입구라고 생각
        System.out.println("minus:");
    }

    // minus
    void multi() {
        System.out.println("multi");
    }

    // multi
    void divide() {
        System.out.println("divide");
    }

    // divide

}

public class Meth01 {
    public static void main(String[] args) {// public없으면 외부에서 못찾음/ static:jvm이 찾을수있도록 표시,/jvm이 실행 main :메서드 이름Z //
                                            // (동전투입구){메서드의 바디 stack영역 }
        Cal01 c1 = new Cal01();// c1앞에 타입을 써줌(Cal01) //계산기 오브젝트 하나 만들어짐

        c1.add();// c1.:호출
        c1.minus();
        c1.multi();
        c1.divide();

        Cal01 c2 = new Cal01();// c1앞에 타입을 써줌(Cal01) //계산기 2개 생성

        c2.add();// c1.:호출
        c2.minus();
        c2.multi();
        c2.divide();

        // 알고리즘을 void안에 넣어놓고 필요할때마다 호출해서 쓰면 됨

    }

}
