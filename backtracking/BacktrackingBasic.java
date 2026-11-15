package backtracking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BacktrackingBasic {

    static void changeArr(int[] arr, int i, int value){
        //Base case step
        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        // Self work step
        arr[i] = value;

        // Recursive work step
        changeArr(arr,i+1, value+1);

        // Backtracking step
        arr[i] = arr[i] - 2; // Decrease value by 2
    }

    static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}
