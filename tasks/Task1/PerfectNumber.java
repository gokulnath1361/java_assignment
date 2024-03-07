package tasks.Task1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int num=scanner.nextInt();  
        int perfect=0;
        for(int i=1;i<=num/2;i++){
             if(num%i==0){
                perfect+=i;  
             }
        }
        //  System.out.println(perfect);
       if(num==perfect){
           System.out.println("Perfect number");
       }
       else{
           System.out.println("Not Perfect number");
       }
   }
}
