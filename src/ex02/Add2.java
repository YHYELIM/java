package ex02;

import java.util.Scanner;
public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //system.in 키보드
        //system.out 모니터

        int x,y,sum;
        
        System.out.println("첫 번째 숫자를 입력하시오:");
        x=sc.nextInt();//속캣에 들어온 값을 입력 코드가 여기서 멈춤

        System.out.println("두 번째 숫자를 입력하시오:");
        y= sc.nextInt();
         sum=x+y;
         System.out.println(sum);




        
    }
    
}
