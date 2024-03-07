package Test2.Projects;
import java.util.Scanner;

public class ScintificCalci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**********************Scientific Calculator*********************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Logarithm (base 10)");
            System.out.println("11. Natural Logarithm (base e)");
            System.out.println("12. Factorial");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    SquareRoot();
                    break;
                case 6:
                    Power();
                    break;
                case 7:
                    Sine();
                    break;
                case 8:
                    Cos();
                    break;
                case 9:
                    Tan();
                    break;
                case 10:
                    Logarithm();
                    break;
                case 11:
                    NaturalLogarithm();
                    break;
                case 12:
                    Factorial();
                    break;
                case 13:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void Addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 + num2));
    }

    private static void Subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 - num2));
    }

    private static void Multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 * num2));
    }

    private static void Division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();

        if (denominator != 0) {
            System.out.println("Result: " + (numerator / denominator));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    private static void SquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        if (num >= 0) {
            System.out.println("Result: " + Math.sqrt(num));
        } else {
            System.out.println("Error: Square root of a negative number is not a real number.");
        }
    }

    private static void Power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println("Result: " + Math.pow(base, exponent));
    }

    private static void Sine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        double radians = Math.toRadians(angle);
        System.out.println("Result: " + Math.sin(radians));
    }

    private static void Cos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        double radians = Math.toRadians(angle);
        System.out.println("Result: " + Math.cos(radians));
    }

    private static void Tan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        double radians = Math.toRadians(angle);
        System.out.println("Result: " + Math.tan(radians));
    }

    private static void Logarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for logarithm (base 10): ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.log10(num));
    }

    private static void NaturalLogarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for natural logarithm (base e): ");
        double num = scanner.nextDouble();
        System.out.println("Result: " + Math.log(num));
    }

    private static void Factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer for factorial: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Error: Factorial is defined only for non-negative integers.");
        } else {
            long result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("Result: " + result);
        }
    }
}

