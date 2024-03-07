import java.io.*;
public class StrongNumber {
    public static void main(String[]args){
           int a=40585;
           int k=a;
           int c=a;
           int d=0;
        while(c!=0){
            int b=1;
                a=c%10;
                //b=a*a*a;
                if(a==0){
                        b=1;
                    }
                    else{
                     for(int i=1;i<=a;i++){
                    b*=i;
                    }
                   // System.out.println(b);
                }
                d+=b;
                c=c/10;
        }
        System.out.println(d);
        if(k==d){
            System.out.println("strong number");
        }
        else{
            System.out.println("not a strong number");
        }
     }
}


