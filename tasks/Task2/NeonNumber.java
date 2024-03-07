package tasks.Task2;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int num=scanner.nextInt();
        int sqr=num*num;
        int a=sqr;
        int c=a;
        int b=0;
        while(c!=0){
           a=c%10;
           b+=a;
           c=c/10;
        }
        //System.out.println(b);
        if(num==b){
            System.out.println("The given num is Neon number");
        }
        else{
            System.out.println("The given num is not a Neon number");
        }
    }
}
