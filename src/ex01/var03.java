package ex01;

public class var03 {
    public static void main(String[] args) {
            //업 캐스팅, 묵시적 형변환
            int n1=10;//4 
            double d1 = n1;//8  n1이 들어갈수 있음: 변수의 선언 double의 공간이 더 크기때문에 = 묵시적 형변환 
            System.out.println(d1);

            //다운 캐스팅, 명시적 형변환 문법 정리 해놔야함
            double d2=10.5;//내가 큰데 작은곳에 넣고 싶으면 잘라서 넣어야함
            int n2=(int)d2;//0.5날아감


            //문자 형변환 
            byte ch=65;
            char data =(char)ch;// byte와 char는 담는 타입자체가 다름 묵시적 형변환 안됨
            System.out.println(ch);

      
    }
    
}
