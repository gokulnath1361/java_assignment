package tasks.Task2;

import java.util.Scanner;

public class SumofDigits {
     public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int num=scanner.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digits is :"+sum);
        scanner.close();
     }    
}
