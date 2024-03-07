import java.io.*;
public class Automorphic {
    public static void main(String[]args){
          int num=453;
          int c=num*num;
          int comdig=0;
          int pos=1;
          int a=num;
          while(a!=0){
            int currdig=c%10;
            comdig=comdig+currdig*pos;
            c=c/10;
            pos=pos*10;
            a=a/10;
          }
           System.out.println(comdig);
          if(num==comdig){
            System.out.println("it is automorphic number");
          }
          else{
            System.out.println("not automorphic number");
          }
          
    }
}
