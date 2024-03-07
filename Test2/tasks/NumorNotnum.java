package Test2.tasks;
// import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class NumorNotnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        try {
            double number = scanner.nextDouble();
            System.out.println("You entered a number: " + number);
        } catch (InputMismatchException e ) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
             scanner.close();
    }
}


