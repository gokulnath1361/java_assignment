package Test2.tasks;

public class OddEvenInArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.print("Odd and Even Numbers in Array: ");
        System.out.print("[");
        for (int num : numbers) {
            System.out.print(num);
            if (num < numbers.length) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
