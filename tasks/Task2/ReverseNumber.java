package tasks.Task2;

import java.util.Scanner;

public class ReverseNumber {
     public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number or string:");
        String mystring=scanner.nextLine();
        String first="";
        String second="";
        for(int i=0;i<mystring.length();i++){
            first+=mystring.charAt(i);
        }
         for(int j=mystring.length()-1;j>=0;j--){
           second+=mystring.charAt(j);
        }
        // System.out.println(first);
        System.out.println("The reversed number or string is:"+second);
    }
}
