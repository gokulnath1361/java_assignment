package tasks.Task1;

import java.util.Scanner;

class WithoutThird{
    public static void main (String[]args)
{
    Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=scanner.nextInt();
        System.out.print("Enter the second number:");
        int b=scanner.nextInt();
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("value of first num is:"+a);
   System.out.println("value of second num is:"+b);
}   
}

    

