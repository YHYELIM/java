package ex05.ch03;

class 지구인 {
}

class 아시아인 extends 지구인 {
    void speak() {
        System.out.println("아시아어");
        // 오버라이드(무효화하다) 됨
    }
}

class 한국인 extends 아시아인 {
    void speak() {
        System.out.println("한국어");
        // 부모가 가진 메서드를 동일한 이름으로 자식이 들고있으면 재정의
        // 재정의를 하게 되면 부모의 메서드가 오버라이드됨
        // if) new 한국인을 해서 힙에 띄우면 찾아내려가면서 메서드 재정의하면서 부모는 오버라이드됨
    }

    String name = "지구인";
}

class 홍길동 extends 한국인 {
}

public class Exten01 {
    public static void main(String[] args) {
        지구인 p1 = new 홍길동();// 타입이 메모리 공간에 위치를 가리킴
        // 홍길동은 한국인이니?ㅇㅇ
        // 홍길동 캐스팅(타입 바꿔치기) 한국인,아시아인,지구인 다 가능=>다형성
        // 지구인을 가리키는 주소 p1

        한국인 p2 = new 한국인();
        p2.speak();
        // new ->힙에 띄움
        // 한국인을 가리키는 p2
        // 찾은 메모리 번지에서 위로 스캔
        // 찾으면 스캔 안함 없으면 끝까지 위로 풀스캔 (변수, 메서드)

        // 아래에서 위로 스캔

        아시아인 p3 = new 한국인();

        p3.speak();

    }

}
// 홍길동 (한국인. 아시아인. 지구인) 이렇게 힙에 뜸
