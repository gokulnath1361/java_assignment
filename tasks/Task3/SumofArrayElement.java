package tasks.Task3;

public class SumofArrayElement {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8};
        int sum=0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println("Sum of elements in the array is : "+sum);
    }
}
