 import java.io.*;
 class WithoutThirdVariableimport{
    public static void main (String[]args)
{
   int a=7;
   int b=3;
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("value of a is"+a);
   System.out.println("value of b is"+b);
}   
}
