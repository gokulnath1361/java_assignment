package tasks.Task5;

public class A_BB {
    public static void main(String[]args){
        char l='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                 System.out.print(l+" "); 
            };
            l++;
            System.out.println();
        };
    }
}
