import java.io.*;
public class RandomNumberGenerator {
    public static void main(String[] args){
        for(int i=0;i<=10;i++){
        int number=(int) (Math.random()*100);
        System.out.println(number);
        }
    }
}
