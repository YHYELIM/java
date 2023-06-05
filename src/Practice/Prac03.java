package Practice;

import java.util.Scanner;

// import java.util.Scanner;
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.println("초 를 입력하시오 :");
//         int time=sc.nextInt();
//         int sec=(time%60);
//         int min=(time/60);

//         System.out.println(time+"초는"+min+"분"+sec+"초입니다.");
public class Prac03{
    public static void main(String[] args) {
        
        
        System.out.println("초 를 입력하시오");
        Scanner sc= new Scanner(System.in);

        int time=sc.nextInt();

        int min=(time/60);


        int sec=(time%60);

        System.out.println(time+"초는"+min+"분"+sec+"초입니다.");
    }


}


        
     
    
 
