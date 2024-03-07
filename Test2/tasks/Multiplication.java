package Test2.tasks;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Table to print: ");
         int table=scanner.nextInt();
        int number=12;
        for(int i=1;i<=number;i++){
            System.out.println(i+"x"+table+"="+(i*table));
        }
       
    }
}

