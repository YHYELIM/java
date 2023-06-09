package ex05.ch06;

abstract public class ProtossUnit {
    String name;
    int hp;
    int attack;

    public ProtossUnit(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

}
// 빈 껍데기 때리면 실행 되는 이유->오버라이드