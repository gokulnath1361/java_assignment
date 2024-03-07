import java.io.*;
import java.util.Arrays;
public class Palindrome {
    public static void main (String[]args){
       // int[] num={1,2,3,4,5,6,7,8};
        int[] num={1,2,3,4,3,2,1};
        //char[] num={'p','q','r','q','p'};
        int[] arr=new int[num.length];
        int[] arr1=new int[num.length];
        for(int i=num.length-1;i>=0;i--){
             //System.out.println(num[i]);
              arr[i]=num[i];
        }
        for(int j=0;j<num.length;j++){
             //System.out.println(num[j]);
              arr1[j]=num[j];
        }
       // if(arr.equals(arr1)){
        if(Arrays.equals(arr,arr1)){
                System.out.println("this is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
