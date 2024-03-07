package Test2.Projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private double balance;

    public User(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class BankingApplication {

    private static Map<String, User> users = new HashMap<>();
    private static User currentUser;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******************Banking Application******************");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting the banking application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.next();
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please choose another username.");
            return;
        }

        System.out.print("Enter a password: ");
        String password = scanner.next();
        System.out.print("Enter initial balance: Rs");
        double initialBalance = scanner.nextDouble();

        User newUser = new User(username, password, initialBalance);
        users.put(username, newUser);
        System.out.println("Account created successfully!");
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            currentUser = users.get(username);
            System.out.println("Login successful. Welcome, " + currentUser.getUsername() + "!");
            performBankingOperations();
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void performBankingOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Logging out. Goodbye, " + currentUser.getUsername() + "!");
                    currentUser = null;
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Balance: Rs" + currentUser.getBalance());
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the deposit amount: Rs");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            currentUser.setBalance(currentUser.getBalance() + amount);
            System.out.println("Deposit successful. New balance: Rs" + currentUser.getBalance());
        } else {
            System.out.println("Invalid amount. Please enter a positive value for deposit.");
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: Rs");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= currentUser.getBalance()) {
            currentUser.setBalance(currentUser.getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: Rs" + currentUser.getBalance());
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value for withdrawal.");
        } else {
            System.out.println("Insufficient Balance. Withdrawal amount exceeds the available balance.");
        }
    }
}

