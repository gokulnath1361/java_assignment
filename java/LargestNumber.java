import java.io.*;
public class LargestNumber {
    public static void main (String[]args){
        int[] arr={12,32,45,11,3,56,14,42};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
                if(arr[i]>largest){
                   largest=arr[i];
                }
            }
             System.out.println("the largest num is:"+largest);
    }
}
