package Recursion;

public class SortedArray { // Time Complexity O(n) Space Complexity O(n)

    public static boolean isSortedInAsc(int[] arr, int idx){
        // Base case
        if(idx == arr.length -1) return true;

        // Self work
        if(arr[idx] > arr[idx + 1]) return false;

        // recursive work
        return isSortedInAsc(arr, idx+1);
    }

    static void main(String[] args) {
        int[] arr = {1,1,0,4,5,7};
        System.out.println(isSortedInAsc(arr,0));
    }
}
