package devideAndConqure;

import java.util.Arrays;

public class MergeSort { // Time complexity O(n log n) Space complexity O(n)

    public static void mergeSort(int[] arr, int si, int ei){
        // Base case
        if(si >= ei){
            return;
        }

        // Recursive work
        int mid = si + (ei - si)/2;
        mergeSort(arr,si,mid); // Left part
        mergeSort(arr,mid+1, ei); // Right Part

        // Self work merge the array
        merge(arr,si,mid,ei);
    }

    static void merge(int[] arr, int si, int mid, int ei){
        // Create a temporary array if ending index is 5 and starting index is 0 then it's create 6 size of array
        int[] tempArr = new int[ei-si+1];
        int i = si; // Left side iterator
        int j = mid + 1; // Right side iterator
        int k = 0; // TemptArray iterator

        // Merge the two side of small elements
        while (i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                tempArr[k] = arr[i++];
            }else {
                tempArr[k] = arr[j++];
            }
            k++;
        }

        // Fill tempArr those elements left
        while (i<= mid){
            tempArr[k++] = arr[i++];
        }
        while (j <= ei){
            tempArr[k++] = arr[j++];
        }

        // Reset the value and iterate with the same variable
        i = si;
        k = 0;
        // Copy temp elements in the original array.
        while (k<tempArr.length){
            arr[i++] = tempArr[k++];
        }
    }

    static void main(String[] args) {

        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
