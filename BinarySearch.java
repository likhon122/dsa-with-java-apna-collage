
public class BinarySearch {

    public static int binarySearch(int arr[], int value) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) {// Found And return the index
                return mid;
            } else if (arr[mid] > value) { // Probably have in the First half
                end = mid - 1;
            } else {// Probably have in the second half
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 10, 27, 88, 99};
        int index = binarySearch(arr, 88);
        if (index < 0) {
            System.out.println("Not Found");
        } else {
            System.out.println("You value at index "  + index);
        }
    }

}
