package tasks.Task3;

public class MinMaxArray {
    public static void main(String[] args){
        int[] numbers = {5,7,2,3,8,9,1};
        int min = numbers[0];
        int max = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
             if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Minumum value is : "+min);
        System.out.println("Maximum value is : "+max);
    }
}
