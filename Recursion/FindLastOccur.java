package Recursion;

public class FindLastOccur {
    static int findLastOccur(int[] arr, int idx, int num){ // Time complexity O(n) Space complexity O(n)
        // Base case
        if(idx == arr.length) return -1;

        // Recursive work
        int haveOccur = findLastOccur(arr, idx+1 , num);

        // Self work
        if(arr[idx] == num && haveOccur < 0) return idx;
        return haveOccur;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,2,1,2};
        System.out.println(findLastOccur(arr,0,2));
    }
}
