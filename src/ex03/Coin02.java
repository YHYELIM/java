package ex03;

public class Coin02 {

    final int money = 120005160; // scanner 로 수정하기
    int restMoney = money; // 남은 금액 변수 만들기
    int count; // 동전 개수를 담을 변수

    void printRestMoney(int m) { // 행위 //static붙이면 안되는 이유는 공간이 달라지니까 //모듈화 해서 두고 참고해서 쓴다
        // 메소드 문법=동사+복합명사 띄어쓰기 대신 대문자로 꺾어쓴다
        // 코딩을 할땐 이름을 잘 지어야한다
        count = restMoney / m;
        System.out.println(m + "원 : " + count);
        restMoney = restMoney % m;
    }

    public static void main(String[] args) {
        Coin02 c2 = new Coin02();
        c2.printRestMoney(500);
        c2.printRestMoney(100);
        c2.printRestMoney(50);
        c2.printRestMoney(10);

    }

}
