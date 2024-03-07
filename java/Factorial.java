import java.io.*;
class Factorial {
    public static void main(String[]args){
      int num=10;
      int factorial=1;
      for(int i=1;i<num;++i){
        factorial*=i;
      } 
      if(num==0){
        factorial=1;
      }
      System.out.println("factorial="+factorial); 
    }
}
