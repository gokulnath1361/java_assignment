import java.io.*;
public class PerfectNumber {
    public static void main(String[]args){
         int num=10;
         int perfect=0;
         for(int i=1;i<=num/2;i++){
              if(num%i==0){
                 perfect+=i;  
              }
         }
        //   System.out.println(perfect);
        if(num==perfect){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect number");
        }
    }
}
