import java.io.*;
public class SpyNumber {
    public static void main(String[]args){
          int num=1124;
          int a=num;
          int c=num;
          int mul=1;
          int add=0;
          while(c!=0){
                a=c%10;
                mul*=a;
                add+=a;
                c=c/10;
          }
          System.out.println(mul);
          System.out.println(add);
          if(mul==add){
            System.out.println("it is spy number ");
          }
          else{
            System.out.println("it is not spy number ");
          }
    }
}
