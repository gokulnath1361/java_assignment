package Test2.tasks;
import java.io.*;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  string:");
        String mystring=scanner.nextLine();
        String first="";
        String second="";
        for(int i=0;i<mystring.length();i++){
            first+=mystring.charAt(i);
        }
         for(int j=mystring.length()-1;j>=0;j--){
           second+=mystring.charAt(j);
        }
        if(first.equals(second)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }

    }
}

