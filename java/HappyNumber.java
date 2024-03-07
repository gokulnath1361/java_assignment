import java.io.*;
public class HappyNumber {
    public static void main(String[]args){
        int[] myarr=new int[100];   
        int num=19;
        boolean flag=false;
        int c=num;
        int a=0;
        int i=0;
        while(c!=1 && c!=4 ){
            int d=0;
            while(c>0){
             int b=0;
              b=c%10;
              a=b*b;
              d+=a;
            //    for(int j=0;j<i;j++){
            //      System.out.println(myarr[j]);
            //    }
              c=c/10;
            }
             //System.out.print(d);
            myarr[i]=d;
            i++;
            c=d;
            //System.out.print(d);
            if(d==1){
                   flag=true;
                //System.out.println("the given number is happy number ");
            }
        }
         if(flag==true){
                  // b=1;
                System.out.println("the given number is happy number ");
            }
            else{
                System.out.println("the given number is not happy number ");
            }
    }
}
