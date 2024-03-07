package tasks.Task1;

import java.io.*;
import java.util.Scanner;
class PrimeNumber {
    public static void main (String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int i=scanner.nextInt();
        int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
               System.out.println("The given num is prime num");
        }
        else{
            System.out.println("It is not prime number");
        }
    }
}
