package ex05.ch05.composit2;

public class HotDogSet {
    // extends 안됨 핫도그 세트야 너 콜라니? 아니 너 프라이니? 아니
    // 한 상자에 모든것을 다 담고싶다-> composit 한다
    private HotDog HotDog;
    private Coke Coke;
    private Fri Fri;

    public HotDogSet() {
        this(new HotDog(), new Coke(), new Fri());// 클래스로 가서 this 해야함

    }

    public HotDogSet(ex05.ch05.composit2.HotDog hotDog, ex05.ch05.composit2.Coke coke, ex05.ch05.composit2.Fri fri) {
        this.HotDog = hotDog;
        this.Coke = coke;
        this.Fri = fri;
    }

    public HotDog getHotDog() {
        return HotDog;
    }

    public Coke getCoke() {
        return Coke;
    }

    public Fri getFri() {
        return Fri;
    }

}
