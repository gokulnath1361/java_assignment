package Test2.tasks;

public class CopyArray {
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};
            int[] newArray = new int[originalArray.length];
            for (int i = 0; i < originalArray.length; i++) {
                newArray[i] = originalArray[i];
            }
            System.out.print("Original Array : ");
            for (int num : originalArray) {
                System.out.print(+num + " ");
            }
            System.out.println();
            System.out.print("Copied Array   : ");
             for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    
}
