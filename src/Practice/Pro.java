package Practice;

import java.util.Scanner;

public class Pro {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("오렌지의 개수를 입력하시오:");

        int org = sc.nextInt();
        int box = (org/12);
        int gae = (org%12);

        System.out.println(box+"박스가 필요하고"+gae+"개가 남습니다");


    }
}


    

