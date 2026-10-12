
public class LinearSearch {

    public static int findNumberIndex(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = findNumberIndex(arr, 5);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Your number is at index " + index);
        }
    }
}
