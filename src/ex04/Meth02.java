package ex04;

//class만 작성 가능
class Cal02 {
    // 행위만 만들것이다
    void add(int n1, int n2) {// 매개변수 //stack에 존재-method 종료시 없어짐 (로컬변수특징:생명주기가 짧다)
        System.out.println("더하기:" + (n1 + n2));// void:return 안함//스택을 종료하고 복귀주소를 확인하고 복귀한다
    }// method의 제일 기본형

    void minus(int n1, int n2) {// 괄호 안은 동전 투입구라고 생각
        System.out.println("빼기:" + (n1 - n2));
    }

    // minus
    void multi(int n1, int n2) {
        System.out.println("곱하기:" + (n1 * n2));
    }

    // multi
    void divide(int n1, int n2) {
        System.out.println("나누기:" + (n1 / n2));
    }

    // divide

}

public class Meth02 {
    public static void main(String[] args) {// static에 뜨고 JVM이 main 찾음 main stack에 뜬다는 뜻
        Cal02 c1 = new Cal02();// c1앞에 타입을 써줌(Cal01) //계산기 오브젝트 하나 만들어짐 //main stack에 뜬다

        c1.add(10, 5);// c1.:호출
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);

        // Cal02 c2 = new Cal02();// c1앞에 타입을 써줌(Cal01) //계산기 2개 생성

        // c2.add(20, 30);// c1.:호출 //인수
        // c2.minus();
        // c2.multi();
        // c2.divide();

        // 알고리즘을 void안에 넣어놓고 필요할때마다 호출해서 쓰면 됨

    }

}
