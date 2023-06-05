package ex05.ch01;

public class Dragoon {
    String name;
    int hp;
    int attack;// 힙에 뜬다 얘를 가르키는 주소는 메인 스택에 뜬다

    public Dragoon(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

}
