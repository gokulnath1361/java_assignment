package tasks.Task2;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int num=scanner.nextInt();
        int a=num;
        int c=num;
        int mul=1;
        int add=0;
        while(c!=0){
              a=c%10;
              mul*=a;
              add+=a;
              c=c/10;
        }
        // System.out.println(mul);
        // System.out.println(add);
        if(mul==add){
          System.out.println("The given number is Spy number ");
        }
        else{
          System.out.println("The given number is not a Spy number ");
        }
  }
}
