package Test2.Projects;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("*************Temperature Converter***************");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
                case 3:
                    celsiusToKelvin();
                    break;
                case 4:
                    kelvinToCelsius();
                    break;
                case 5:
                    fahrenheitToKelvin();
                    break;
                case 6:
                    kelvinToFahrenheit();
                    break;
                case 7:
                    System.out.println("Exiting the temperature converter. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Result: " + fahrenheit + " F");
    }

    private static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Result: " + celsius + "*C");
    }

    private static void celsiusToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println("Result: " + kelvin + " K");
    }

    private static void kelvinToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.println("Result: " + celsius + " *C");
    }

    private static void fahrenheitToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
        System.out.println("Result: " + kelvin + " K");
    }

    private static void kelvinToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
        System.out.println("Result: " + fahrenheit + " F");
    }
}

