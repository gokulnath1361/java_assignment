import java.io.*;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
           int a=scanner.nextInt();
           int k=a;
           int c=a;
           int d=0;
        while(c!=0){
            int b=0;
                a=c%10;
                b=a*a*a;
                d+=b;
                c=c/10;
        }
        //System.out.println(d);
        if(k==d){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not a amstrong number");
        }
     }
}
