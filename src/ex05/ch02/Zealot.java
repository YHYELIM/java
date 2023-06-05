package ex05.ch02;

public class Zealot extends ProtossUnit {
    String name;
    int hp;
    int attack;

    // new할때 얘 호출
    public Zealot(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

}
// 질럿이 드라군을 공격한다했을떄 질럿의 어택과 드라군의 hp가 필요
