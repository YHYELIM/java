package ex02;

import java.util.Scanner;

// import java.util.Scanner;


// public class MiniProject {
//     public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     // double c_temp;
//     // int f;
//     // double c_temp=5/9*(f-32);

//     double r1 = 5.0/9.0*(100-32);
//     System.out.println();



//     // System.out.println("1.화씨->섭씨");
//     // System.out.println("2.섭씨->화씨");
//     // System.out.println();

//     // System.out.println("화씨 온도를 입력하시오:");
//     // f=sc.nextInt();
//     // System.out.println("번호를 선택하시오:");
//     // System.out.println();//모르겠다 
// //     System.out.println("섭씨온도는"+c_temp);
// //     c_temp=sc.nextInt();

//    }
public class MiniProject {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);

        System.out.println("화씨온도를 입력하시오: ");
        double hasi = sc.nextInt();
        double subsi = (5.0/9.0)*(hasi-32);
        System.out.println("섭씨온도는 "+subsi);
    }
}
    
    
    
    
