package Test2.tasks;

public class TwoPattern {
    public static void main(String[] args) {
        int n = 6; 
        for (int i = n; i >= 1; i--) {
            
            for (int j = 1; j <=n-i; j++) {
              System.out.print(i);  
            }
            System.out.println();
        }
    }
    
}
