package Test2.tasks;
    
import java.io.*;
import java.util.Scanner;
class Factorial {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the number:");

      int num=scanner.nextInt();
      int factorial=1;
      for(int i=1;i<num;++i){
        factorial*=i;
      } 
      if(num==0){
        factorial=1;
      }
      System.out.println("Factorial="+factorial); 
    }
}

