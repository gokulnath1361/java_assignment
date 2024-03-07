package tasks.Task3;

import java.util.Scanner;

class Voter{
   private String name;
   private int age;
    public Voter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String nam = scanner.nextLine();
        this.name=nam;
         System.out.print("Enter your age : ");
        int enteredage = scanner.nextInt();
        this.age=enteredage;
        scanner.close();
    }
    public void Calculatingage(){
        if(age>18){
            System.out.printf("Hello %s you are eligible for voting...",name);
        }
        else{
            System.out.printf("Sorry %s you are not eligible for voting...",name);
        }
    }
}

public class VoteEligibility {
    public static void main(String[] args){
              Voter vote = new Voter();
              vote.Calculatingage();
    }
}
