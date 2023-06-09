package ex05.ch06;

public class App {
    static void attack(ProtossUnit u1, ProtossUnit u2) {

        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군", 100, 5);
        attack(z1, d1);
        ProtossUnit dt1 = new DarkTempler("다크템플러1", 50, 100);
        ProtossUnit z2 = new Zealot("질럿2", 30, 10);
        attack(dt1, z2);
        ProtossUnit dt2 = new DarkTempler("다크템플러2", 10, 100);
        ProtossUnit d2 = new Dragoon("드라군2", 30, 2);
        attack(dt2, d2);

    }
}
