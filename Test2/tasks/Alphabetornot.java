package Test2.tasks;
import java.util.*;
import java.util.Scanner;

public class Alphabetornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Alphabet: ");

        char inputChar = scanner.next().charAt(0);

        if (Character.isLetter(inputChar)) {
            System.out.println(inputChar + " is an alphabet.");
        } else {
            System.out.println(inputChar + " is not an alphabet.");
        }
             scanner.close();
    }
}




