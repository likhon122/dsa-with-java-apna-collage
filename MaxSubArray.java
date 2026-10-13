
// This is brute force approach!!! it's time complexity is O(n3)
public class MaxSubArray {

    public static void maxSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum of the sub array is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxSubArray(arr);
    }
}
