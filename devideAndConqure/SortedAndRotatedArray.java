package devideAndConqure;

public class SortedAndRotatedArray {

    static int search(int[] arr, int tar, int si, int ei){
        // Base case
        if(si > ei){ // Invalid index means the targeted element not exist in the array
            return -1;
        }
        // Self work
        int mid = si + (ei - si)/2;
        int midValue = arr[mid];

        // Check midValue is the targeted element or not
        if(midValue == tar) return mid;

        // Line 1 check Case 1
        if(arr[si] <= midValue){
            // Case a: Left side of the line 1
            if(arr[si] <= tar && tar <= midValue){
                return search(arr,tar,si,mid-1);
            }else {
                // Case b: Right (Right of the array) side fo the line 1
                return search(arr,tar,mid+1,ei);
            }
        }else { // Mid in line 2 Check case 2
            // Case C: Right side of the Line 2
            if(midValue <= tar && tar <= arr[ei]){
                return search(arr,tar,mid+1,ei);
            }else {
                // Case D: Left side (Left of the array) of the Line 2
                return search(arr,tar,si,mid-1);
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,};
        int index = search(arr,0,0,arr.length-1);
        System.out.println(index);
    }
}


