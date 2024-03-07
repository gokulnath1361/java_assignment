package tasks.Task2;

import java.util.Scanner;

public class CircumferenceofCircle {
      public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the radius of Circle:");
        double radius=scanner.nextInt();
        double circumference = ((2 * Math.PI )*radius);
        System.out.println("The circumference of the Circle is : "+circumference);
      }    
}
