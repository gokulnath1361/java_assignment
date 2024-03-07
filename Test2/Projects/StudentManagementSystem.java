package Test2.Projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    Map<String, Integer> marks;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new HashMap<>();
    }

    public void addMarks(Map<String, Integer> subjectMarks) {
        marks.putAll(subjectMarks);
    }

     public String toString() {
        return "Student [Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks + "]";
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("********************Student Management System***********************");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Display Students");
            System.out.println("4. View Marks");
            System.out.println("5. Remove Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addMarks();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    viewMarks();
                    break;
                case 5:
                    removeStudent();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();

        Student student = new Student(name, rollNumber);
        studentList.add(student);

        System.out.println("Student added successfully!\n");
    }

    private static void addMarks() {
        if (studentList.isEmpty()) {
            System.out.println("No students available. Add a student first.\n");
        } else {
            System.out.println("Enter marks for a student:");

            displayStudents();

            System.out.print("Enter student roll number: ");
            int rollNumber = scanner.nextInt();

            Student student = findStudentByRollNumber(rollNumber);

            if (student != null) {
                System.out.print("Enter the number of subjects: ");
                int numSubjects = scanner.nextInt();

                Map<String, Integer> subjectMarks = new HashMap<>();

                for (int i = 0; i < numSubjects; i++) {
                    System.out.print("Enter subject " + (i + 1) + " name: ");
                    String subject = scanner.next();

                    System.out.print("Enter marks for " + subject + ": ");
                    int mark = scanner.nextInt();

                    subjectMarks.put(subject, mark);
                }

                student.addMarks(subjectMarks);

                System.out.println("Marks added successfully!\n");
            } else {
                System.out.println("Student not found with the given roll number.\n");
            }
        }
    }

    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display. Add students first.\n");
        } else {
            System.out.println("List of Students:");
            for (Student student : studentList) {
                System.out.println(student);
            }
            System.out.println();
        }
    }

    private static void viewMarks() {
        if (studentList.isEmpty()) {
            System.out.println("No students available. Add a student first.\n");
        } else {
            System.out.println("Enter student roll number to view marks:");

            displayStudents();

            System.out.print("Enter student roll number: ");
            int rollNumber = scanner.nextInt();

            Student student = findStudentByRollNumber(rollNumber);

            if (student != null) {
                System.out.println("Marks for " + student.name + " (Roll Number: " + student.rollNumber + "):");
                for (Map.Entry<String, Integer> entry : student.marks.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                System.out.println();
            } else {
                System.out.println("Student not found with the given roll number.\n");
            }
        }
    }

    private static void removeStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students available. Add a student first.\n");
        } else {
            System.out.println("Enter student roll number to remove:");

            displayStudents();

            System.out.print("Enter student roll number: ");
            int rollNumber = scanner.nextInt();

            Student student = findStudentByRollNumber(rollNumber);

            if (student != null) {
                studentList.remove(student);
                System.out.println("Student removed successfully!\n");
            } else {
                System.out.println("Student not found with the given roll number.\n");
            }
        }
    }

    private static Student findStudentByRollNumber(int rollNumber) {
        for (Student student : studentList) {
            if (student.rollNumber == rollNumber) {
                return student;
            }
        }
        return null;
    }
}
