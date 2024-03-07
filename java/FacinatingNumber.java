import java.io.*;
public class FacinatingNumber {
    public static void main(String[]args){
       int num=265;
       String conact="";   
       conact=""+(num*1)+(num*2)+(num*3);
       for(int i=1;i<=9;i++){
        int count=0;
        for(int j=0;j<conact.length();j++){
            if(Integer.parseInt(String.valueOf(conact.charAt(j)))==i){
                count++;
            }
        }
        if(count!=1){
            System.out.println("the given num is not Facinating number");
            return;
        }
       }
            System.out.println("the given num is  Facinating number");
    }
}
