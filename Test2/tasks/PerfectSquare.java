package Test2.tasks;

public class PerfectSquare {
    public static void main(String[] args) {
        int size = 5; 
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
