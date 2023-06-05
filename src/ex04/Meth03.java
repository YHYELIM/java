package ex04;

class Account {
    // 입금(입금할 금액, 계좌잔액)
    // static이 붙어있으면 메모리에 뜨니까 new안붙여도됨
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney;// 리턴은 메서드를 호출한 라인으로 값 반환

    }

    // 출금(입금할 금액300, 계좌잔액-money)
    int withdrow(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;// 실제로 나오는거

    }
    // 이체 (보낼 금액(amount)받는 사람 잔액(receiverMoney), 보내는 사람 금액(sendMoney)
    // 홍 받

}

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000;

        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입금을2번하고 출금을 1번
        Account hAccount = new Account();// Account 타입 //new호출-heap에 deposit, withdrow 뜸
        hMoney = hAccount.deposit(100, hMoney);// .이용해서 행위를 함 //리턴이 되면 이 부분이 1100원으로 바뀜 리턴 안되면 지워짐
        // 클래스 부른후 클래스이름+.+메서드->그럼 그 클래스의 메서드가 실행됨
        // 1100을 money안에 넣음
        System.out.println("남은금액:" + hMoney);// stack에서 사라진 값을 들고오려면 리턴해야함
        hMoney = hAccount.deposit(500, hMoney);
        System.out.println("남은금액:" + hMoney);

        hMoney = hAccount.withdrow(300, hMoney);
        System.out.println("남은금액:" + hMoney);

        // 임꺽정 입금 한번(100) 출금 두번(300,500)

        Account iAccount = new Account(); // heap에 공간2개 생김 홍,임

        iMoney = iAccount.deposit(100, iMoney);

        iMoney = iAccount.withdrow(300, iMoney);
        iMoney = iAccount.withdrow(500, iMoney);
        System.out.println("남은 금액:" + iMoney);

    }
}