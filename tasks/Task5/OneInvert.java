package tasks.Task5;

public class OneInvert {
    public static void main (String[]args){
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<=5-i;j++){
                 System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
