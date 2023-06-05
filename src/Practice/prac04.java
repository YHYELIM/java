package Practice;

import java.util.Scanner;

public class prac04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("번호를 선택하시오:");
System.out.println();

        double hasi=sc.nextInt();
        double seop=(5.0/9.0)*(hasi-32);
        System.out.println("섭씨 온도는 "+seop);


    }
    
}
