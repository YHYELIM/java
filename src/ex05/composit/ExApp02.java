package ex05.composit;

public class ExApp02 {
    public static void main(String[] args) {

        // new Coke();//가비지 컬렉션 일어남
        // 공간을 가리키는 주소가 없기 때문

        Coke c2 = new Coke(400, "콜라");

        // 버거세트쥬셍뇨
        Burger b1 = new Burger();
        Coke c1 = new Coke();
        Potato p1 = new Potato();
        // BurgerSet bs = new BurgerSet(b1, c1, p1);// 컴포지션 (세트안에 다 담아서 준다)
        BurgerSet bs2 = new BurgerSet();

    }

}
