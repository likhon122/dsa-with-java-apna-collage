package devideAndConqure;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] arr, int si, int ei){
        // Base case
        if(si >= ei){
            return;
        }

        // Self work
        int pivotIdx = partition(arr,si,ei);
        // Recursive work
        quickSort(arr,si, pivotIdx-1); // Left side of the pivot
        quickSort(arr,pivotIdx+1,ei);

    }

    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei]; // We assume that pivot is ending index
        int i = si - 1; // To make place for elements smaller than pivot

        // Less than pivot all the elements place the left side of the original array
        for (int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                // Swap the ith and the jth element
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Place the pivot to his right position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = pivot;

        // Return the pivot index
        return i;
    }

    static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8,-2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
