package tasks.Task4;

public class TwoFour {
    public static void main(String[]args){
        int num = 5;
        int counter=1;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++)
            {
                 System.out.print(counter*2+" ");
                 counter++;
            };
            System.out.println();
        };
    }
}
