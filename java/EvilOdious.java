import java.io.*;
public class EvilOdious {
    public static void main(String[]args){
       int num=1;
       int n=num; 
       int count=0;
       while(n>0){
        if(n%2==1){
            count++;
        }
          n=n/2;
       }
       if(count%2==0){
        System.out.println("evil number");
       }
       else{
        System.out.println("odious number");
       }
    }
}
