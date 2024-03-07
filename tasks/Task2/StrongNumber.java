package tasks.Task2;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[]args){
          Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int a=scanner.nextInt();
        int k=a;
        int c=a;
        int d=0;
     while(c!=0){
         int b=1;
             a=c%10;
             if(a==0){
                     b=1;
                 }
                 else{
                  for(int i=1;i<=a;i++){
                 b*=i;
                 }
             }
             d+=b;
             c=c/10;
     }
    //  System.out.println(d);
     if(k==d){
         System.out.println("The given num is Strong number");
     }
     else{
         System.out.println("The given num is not a Strong number");
     }
  }
}
