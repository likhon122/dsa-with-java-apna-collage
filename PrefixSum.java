
// This time we calculate max sub array sum using prefix sum approach this approach is little bit better than brute force approach. This code time complexity is n + n2 that means O(n2). But space complexity is O(n)
public class PrefixSum {

    public static void prefixSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int[] suffixSum = new int[arr.length];
        suffixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            suffixSum[i] += arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                currentSum = i == 0 ? suffixSum[j] : suffixSum[j] - suffixSum[i - 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum sum of the sub array is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        prefixSum(arr);
    }
}
