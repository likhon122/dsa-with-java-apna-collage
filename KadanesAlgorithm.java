
// This algorithm is better than Prefix sum it's time complexity is O(n) and time complexity is O(C) very good algorithm
public class KadanesAlgorithm {

    public static void kadanesAlgorithm(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        int ifNegative = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxNum = Math.max(currentSum, maxNum);
        }

        boolean isNegative = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                isNegative = false;
            }
            if (arr[i] <= 0 && ifNegative < arr[i]) {
                ifNegative = arr[i];
            }
        }

        if (isNegative == true) {
            System.out.println("The max sub array sum is: " + ifNegative);
        } else {
            System.out.println("The max sub array sum is: " + maxNum);
        }

    }

    public static int kadanesAlgorithmBetterApproach(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int maxSoFar = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // First calculate the current sum is grater than the current index num or current sum + current index 
            // Then compare both current sum and max so far
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(currentSum, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0};
        // kadanesAlgorithm(arr);
        int[] arr1 = {-1, -2, -3, -4, -100};
        int[] arr2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("The max sub array sum is: " + kadanesAlgorithmBetterApproach(arr));
        System.out.println("The max sub array sum is: " + kadanesAlgorithmBetterApproach(arr2));

    }
}
