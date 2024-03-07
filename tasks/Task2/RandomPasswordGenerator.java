package tasks.Task2;

public class RandomPasswordGenerator {
    public static void main(String[] args){
        String pass="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%&*";
        char[] chararray=pass.toCharArray();
        for(int j=0;j<10;j++){
             System.out.printf("The generated password %d is : ",j);
        for(int i=0;i<=9;i++){
            int random=(int) (Math.random()*chararray.length);
            char password=chararray[random];
            System.out.print(password);
        }
        System.out.println();
    }
  }
}
