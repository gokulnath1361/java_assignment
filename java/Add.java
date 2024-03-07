// public class Add {

//     public static void main(String args[]){
//     int a=10,b=13,c;
//     c=a+b;
//     System.out.println(c);
// }
// }

import java.util.Scanner;

public class Add{
    public static void main(String args[]){
        while(true){
    Scanner scanner=new Scanner(System.in);
    System.out.print("enter a num:");
    int num =scanner.nextInt();
    if(num==0){
        System.out.println("please enter nonzero numbers");
       
    }
    
    else if(num%2==0){
        System.out.printf("the given number %d is even",num);
        System.out.println();
    }
   else{
    
        System.out.printf("the given number %d is odd",num);
        System.out.println();
   }
  }
}
}