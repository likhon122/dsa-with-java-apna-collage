package Recursion;

public class FindFirstOccur { // Time complexity O(n) Space complexity O(n)

    public static int findFistOccur(int[] arr, int idx, int num){
        // Base case
        if(idx == arr.length) return -1;

        // Self work
        if(arr[idx] == num) return idx;

        // Recursive work
        return findFistOccur(arr, idx+1, num);
    }

    static void main(String[] args) {
        int[] arr = {1,2,2,4,5};
        System.out.println(findFistOccur(arr,0,1));
    }
}
