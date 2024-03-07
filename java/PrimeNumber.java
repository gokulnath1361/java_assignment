import java.io.*;
class PrimeNumber {
    public static void main (String[]args){
        int i=73;
        int count=0;
        //int j;
        // if(i==1 || i==0){
        //     System.out.println("the given num is not prime num");
        // }
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
               System.out.println("the given num is prime num");
        }
        else{
            System.out.println("it is not prime number");
        }
    }
}
