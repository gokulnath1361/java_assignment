import java.io.*;
public class StringPalin {
    public static void main(String[]args){
        String mystring="gokul";
        String first="";
        String second="";
        for(int i=0;i<mystring.length();i++){
          //  System.out.println(mystring.charAt(i));
          //char character=mystring.charAt(i);
            first+=mystring.charAt(i);
        }
        //System.out.println(first);
         for(int j=mystring.length()-1;j>=0;j--){
           //System.out.println(mystring.charAt(j));
          //char character=mystring.charAt(i);
           second+=mystring.charAt(j);
        }
        if(first.equals(second)){
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("this is not palindrome");
        }

    }
}
