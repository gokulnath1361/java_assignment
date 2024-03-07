package tasks.Task1;

import java.io.*;
import java.util.Scanner;
public class Fibonacci {
    public static void main (String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int num=scanner.nextInt();
        int i;
        int next=0;
        for(i=0;i<=num;i++){
             next=next+i;

        }
           System.out.println("Fibonacci is :"+next );
    }
}

