import java.util.Random;

public class Main {

   public static void main(String[] args){
       System.out.println("Воронов пид****!!!!!");

       int c = rann();
       int a = ran();
       int b = ran();
       int rezult;
       double rez;
       switch (c) {
           case (1):

                rezult = We_need_a_new_valya.sum(a,b);
               System.out.println("sum:" + rezult);
               break;
           case (2):
                rezult = min(a,b);
               System.out.println("min:" + rezult);
               break;
           case (3):
                rezult = del(a,b);
               System.out.println("del:" + rezult);
               break;
           case (4):
                rezult = um(a,b);
               System.out.println("um:" + rezult);
               break;
           case (5):
               rez = sin(a,b);
               System.out.println("sin:" + rez);
               break;
           case (6):
               rez = cos(a,b);
               System.out.println("cos:" + rez);
               break;
       }
       System.out.println(a + " " + b);



   }


    public static int min(int a,int b){
        return a - b;
    }
    public static int del(int a,int b){
        return a / b;
    }
    public static int um(int a,int b){
        return a * b;
    }
    public static double sin(int a,int b){
        return Math.sin(a+b);
    }
    public static double cos(int a,int b){
        return Math.cos(a+b);
    }

    public static int ran(){
        return new Random().nextInt(100)-50;
    }
    public static int rann(){
        return new Random().nextInt(6)+1;
    }

}
