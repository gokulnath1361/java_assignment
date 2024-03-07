package tasks.Task1;

import java.io.*;
import java.util.Scanner;
 class EvenOdd {
    public static void main (String[]args)
{
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the number:");

   int a=scanner.nextInt();
   if(a%2==0){
      System.out.println("this is even number"); 
   }
   else{
          System.out.println("this is odd number"); 
   }
}   
}
