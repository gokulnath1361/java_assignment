package Test2.MainQuestions;

public class SecondLargestNum {
        public static void main(String[] args) {
            int[] array = {4,2,8,1,5,7};
            int secondLargest = findSecondLargest(array);
            if (secondLargest != Integer.MIN_VALUE) {
                System.out.println("The second largest number is: " + secondLargest);
            } 
            else {
                System.out.println("The array doesn't have a second largest number.");
            }
        }
        private static int findSecondLargest(int[] array) {
            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
    
            for (int num : array) {
                if (num > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = num;
                } 
                else if (num > secondLargest && num < firstLargest) {
                    secondLargest = num;
                }
            }
    
            return secondLargest;
        }
    
    
}
