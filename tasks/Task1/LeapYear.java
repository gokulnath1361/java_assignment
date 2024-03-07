package tasks.Task1;

import java.util.Scanner;

public class LeapYear {
    public static void main (String[]args)
    {
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
        int a=scanner.nextInt();   
       if(a%4==0){
        System.out.println("This is leap number");
       }
       else{
        System.out.println("This is not leap number");
       }
    }   
    
}
