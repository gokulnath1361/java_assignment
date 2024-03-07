package tasks.Task1;

import java.io.*;
import java.util.Scanner;
 class SwapNumbers{
    public static void main (String[]args)
{
      Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=scanner.nextInt();
        System.out.print("Enter the second number:");
        int b=scanner.nextInt();
   int c;
   c=a;
   a=b;
   b=c;
   System.out.println("value of first num is:"+a);
   System.out.println("value of second num is:"+b);
}   
}