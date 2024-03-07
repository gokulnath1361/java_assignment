package Test2.tasks;

import java.util.Scanner;

public class StringChar {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println("Total number of characters: " + inputString.length());
    }
}
