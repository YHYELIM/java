package ex02;
 class Mem {//파일명과 같아야함 //static 안들어감

    //static으로 되어 있는건 무조건 뜬다
    //static을 다 스캔하고 main이 있으면 실행


    public static class Hello {//정적영역
        int price = 1000;
        String name = "커피";
    
         void run(){//stack영역 동적영역
            
            System.out.println("달린다");
        }
    }
    
   
    
        static int price = 10000;
    
        public static void main(String[] args) {//static에다가 main까지 있으니까 실행
            
            Hello c = new Hello();// class 참조
            System.out.println(c.name);
            System.out.println(c.price);
            
            //동적으로 heap에 띄움
            
            
            c.run();
            
        }
    
    
}
