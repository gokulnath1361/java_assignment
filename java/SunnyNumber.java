import java.io.*;
import java.lang.Math;
public class SunnyNumber {
    public static void main(String[]args){
         double num=8;
         double a=0;
         double b=0;
         double c=0;
         if(num>0){
              a=num+1;
              c=a; 
             // System.out.print(c);
              a=Math.sqrt(a);
             // System.out.print(a);
              b=a*a;  
         }
        // System.out.println(a);
          System.out.println(b);
          System.out.println(c);
          if(b==c){
            System.out.println("it is sunny number");
          }
          else{
            System.out.println("nat a sunny number");
          }
    }
}
