package ex03;

//임포트를 안해도 되는 라이브러리 = 내장 라이브러리
//void random()호출
public class Rock {
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 3) + 1;// 내장라이브러리
        System.out.println(n1);

    }

}
