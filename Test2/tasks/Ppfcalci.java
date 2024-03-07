package Test2.tasks;

import java.util.Scanner;

public class Ppfcalci {
     private static double calculateMaturityAmount(double principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfMonths = years * 12;
        double ppfAmount = principal * Math.pow(1 + monthlyInterestRate, numberOfMonths);

        return ppfAmount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount (in INR): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the investment period in years: ");
        int years = scanner.nextInt();
        double ppfAmount = calculateMaturityAmount(principal, annualInterestRate, years);

        System.out.println("The maturity amount after " + years + " years will be: INR " + ppfAmount);

        scanner.close();
    }

   
}


