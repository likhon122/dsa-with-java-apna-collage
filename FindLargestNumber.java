
public class FindLargestNumber {

    public static int largestNumberFinder(int arr[]) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 77, 28, 2, 1};
        int largestNumber = largestNumberFinder(arr);
        System.out.println("Largest Number is " + largestNumber);
    }

}
