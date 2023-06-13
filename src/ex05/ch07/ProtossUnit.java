package ex05.ch07;

abstract public class ProtossUnit {// 추상 클래스
    String name;
    int hp;
    int attack;

    // name,hp,attack 선언
    // 공통적인 점들 추상클래스에다가
    public ProtossUnit(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }// 추상클래스는 일반 메소드 가질수있다
     // 여기서 this는 나 자신

}
