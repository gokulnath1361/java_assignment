package Test2.tasks;
import java.util.Scanner;

public class Armstrong {

    public static void main(String[]args){
          Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the  number:");
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
     if(k==d){
         System.out.println("The given num is Amstrong number");
     }
     else{
         System.out.println("The given num is not a Amstrong number");
     }
  }
}


