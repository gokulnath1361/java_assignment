import java.io.*;
public class PronicNumber {
    public static void main(String[]args){
      int num=210;
      int val=num;
      int flag=0;
      for(int i=1;i<=num;i++){
        for(int j=num;j>0;j--){
            int a=0;
           // System.out.println(j);
           a=i*j;
           // System.out.print(i);
           if(a==num && i==j+1){
               //System.out.println("this is Pronic number");
               flag+=1;
               break;
           }
        }
      }

      if(flag>=1 || val==0 ){
        System.out.println("this is Pronic number");
      }
      else{
        System.out.println("not Pronic number");
      }
      
    }
}
