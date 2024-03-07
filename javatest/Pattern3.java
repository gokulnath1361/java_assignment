import java.io.*;
import java.util.Scanner;
class Pattern3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        int counter=1;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++)
            {
                 System.out.print(counter+" ");
                 counter++;
            };
            System.out.println();
        };
    }
    
}