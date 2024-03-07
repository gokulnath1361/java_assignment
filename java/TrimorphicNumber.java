import java.io.*;
public class TrimorphicNumber {
    public static void main(String[]args){
       int num=4;
       int c=num;
       int ans=num*num*num;
       int b=ans;
       int concat=0;
       int count=1;
       while(c!=0){
        int d=0;
         d=b%10;
         concat=concat+d*count;
         count=count*10;
         c=c/10;
         b=b/10;
       }
        // System.out.println(concat);
        if(num==concat){
            System.out.println("this is trimorphic number");
        }
        else{
            System.out.println("this is not  trimorphic number");
        }
    }
}
