package tasks.Task3;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args){
        //number sorting
        int[] number={5,2,7,1,3,9,4};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        //string sorting
        String[] names={"john","charli","tony","bob"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
