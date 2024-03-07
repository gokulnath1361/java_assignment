package tasks.Task2;

public class RandomNumberGenerator {
    public static void main(String[] args){
        for(int i=0;i<=10;i++){
        int number=(int) (Math.random()*100);
        System.out.printf("The generated number %d is: %d",i,number);
        System.out.println();
        }
    }
}
