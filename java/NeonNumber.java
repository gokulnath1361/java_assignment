import java.io.*;
public class NeonNumber {
    public static void main(String[]args){
        int num=9;
        int sqr=num*num;
        int a=sqr;
        int c=a;
        int b=0;
        while(c!=0){
           a=c%10;
           b+=a;
           c=c/10;
        }
        //System.out.println(b);
        if(num==b){
            System.out.println("neon number");
        }
        else{
            System.out.println("not a neon number");
        }
    }
}
