import java.io.*;
import java.lang.String;
public class DisariumNumber {
    public static void main(String[]args){
        int num=135;
        int ori=num;
        String valu="";
        int c=num;
        int ans=0;
        int count=0;
        while(c!=0){
            num=c%10;
            valu=num+valu;
             count++;
             c=c/10;  
        }
       // System.out.println(valu);
        for(int i=0;i<valu.length();i++){
            int a=Integer.parseInt(String.valueOf(valu.charAt(i)));
      // System.out.println(a);
            //System.out.println(a);
            ans+=Math.pow(a, i+1);
           //  System.out.println(ans);
        }
        System.out.println(ans);
        if (ori == ans) {
            System.out.println(ori + " is a Disarium number.");
        } else {
            System.out.println(ori + " is not a Disarium number.");
        }
    }
}
