package ex05.composit;

public class BurgerSet {//
    private Burger Burger;
    private Coke Coke;
    private Potato Potato;

    // 여기에 new 못하는 이유- 고정되어 버려서 접근을 못함

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());// 얘 때릴때마다 new 생성 - new: 힙에 접근할 주소줌
    }// composit burgerset라는 하나의 박스에 다 담는다

    private BurgerSet(ex05.composit.Burger burger, ex05.composit.Coke coke, ex05.composit.Potato potato) {
        this.Burger = burger;
        this.Coke = coke;
        this.Potato = potato;
    }

    public Burger getBurger() {
        return Burger;
    }

    public Coke getCoke() {
        return Coke;
    }

    public Potato getPotato() {
        return Potato;
    }
    // 항상 생성자 만들고 게터 만들고
}
