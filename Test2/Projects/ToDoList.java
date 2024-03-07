package Test2.Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private static ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***********************To-Do List**************************");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Show Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    showTasks();
                    break;
                case 4:
                    System.out.println("Exiting the To-Do List. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private static void deleteTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the task to delete: ");
        String task = scanner.nextLine();

        if (tasks.remove(task)) {
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found in the list.");
        }
    }

    private static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            int index = 1;
            for (String task : tasks) {
                System.out.println(index + ". " + task);
                index++;
            }
        }
    }
}

