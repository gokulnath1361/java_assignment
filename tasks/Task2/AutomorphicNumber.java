package tasks.Task2;

import java.util.Scanner;

public class AutomorphicNumber {
    
    public static void main(String[]args){
          Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int num=scanner.nextInt();
        int c=num*num;
        int comdig=0;
        int pos=1;
        int a=num;
        while(a!=0){
          int currdig=c%10;
          comdig=comdig+currdig*pos;
          c=c/10;
          pos=pos*10;
          a=a/10;
        }
         System.out.println(comdig);
        if(num==comdig){
          System.out.println("The given number is Automorphic number");
        }
        else{
          System.out.println("The given number is not a Automorphic number");
        }
        
  }
}
