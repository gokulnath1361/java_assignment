package tasks.Task1;
import java.io.*;
import java.util.Scanner;
public class PascalTriangle {
   public static void main(String[]args){
     Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int n=scanner.nextInt();        
      for(int i=0;i<n;i++){
         int number=1; 
            for(int j=0;j<n-i;j++){
               System.out.print(" ");
            }
             for(int j=0;j<=i;j++)
            {
              System.out.print("  "+number);
              number=((number*(i-j))/(j+1));
            }
            
            System.out.println();
               }
   } 
}

