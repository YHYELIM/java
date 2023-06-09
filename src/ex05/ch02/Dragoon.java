package ex05.ch02;

public class Dragoon extends ProtossUnit {

    String name;
    int hp;
    int attack;

    public Dragoon(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public String getName() {
        return name;
    }
}
// 오버라이드 해서 공통적으로 만든다
// 분석
// 질럿
// 드라군
// 다크템플러
// 프로토스 유닛-> 여기가 다형성 부모가됨 //나머지는 상속받음
// 앱
// setter, getter 알기
// 변수값 깎인 hp, attack후 남은 hp, attack값