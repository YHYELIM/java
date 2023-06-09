package ex05.ch05;

/**
 * 인터페이스
 * 1.필요한 메서드만 노출시키고 싶을때
 * 2.프로그램 설계 할때 특정 메서드만 사용하도록 강제시키고 싶을때
 */

interface CarAble {
    // 인터페이스 이름 뒤에는 에이블
    public abstract void 엑셀();// 인터페이스 추상 메서드 가질수있음 추상클래스와는 다르다
    // 엑셀만 나오게
    // 여기다가 간단한거
}

// CarAble의구현체는 Car이다
class Car implements CarAble {

    // 상태 생략
    private void 엔진가열() {
        System.out.println("엔진가열");
    }

    private void 모터작동() {
        System.out.println("모터작동");

    }

    private void 바퀴회전() {
        System.out.println("바퀴회전");
    }

    public void 엑셀() {
        // TODO Auto-generated method stub

    }
}// 은닉

public class InterEx01 {
    public static void main(String[] args) {
        CarAble carAble = new Car();// 다형성과 상관없다
        carAble.엑셀();

    }

}
// 탈 것에 비유햐면
// 비행기 제트기 배 공통 속성:추상 클래스에놔두고 다른 속성(구체적인것):
// 인터페이스는 상하관계의 약속 다른애가 쓰게 하고싶은데 막 쓰게는 안하게 하고싶음 ->강제성 부여
// 자동차 엑셀, 기어 등등 우리랑 협의해서 안만든거
// 프로토콜은 동등한 관계의 약속 서로 협의를 해서 코딩을 짬 p라고 하는건 프로토콜의 뜻
