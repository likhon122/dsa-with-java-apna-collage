
import java.util.Arrays;
import java.util.Collections;

public class BasicSortingAlgorithm {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > arr[i]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = arr[i];
        }
    }

    public static void inBuildSort(Integer[] arr) {
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        // Descending order
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        Arrays.sort(arr, Collections.reverseOrder());
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void counterSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        // Make the array for the greatest number of frequency array;
        int greatestNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            greatestNum = Math.max(greatestNum, arr[i]);
        }
        int[] frequencyArr = new int[greatestNum + 1];

        // Iterate the main array and count of the frequency of the array and store in frequency array
        for (int i = 0; i < arr.length; i++) {
            frequencyArr[arr[i]]++;
        }

        // Sort the main array
        int j = 0;
        for (int i = 0; i < frequencyArr.length; i++) {
            while (frequencyArr[i] > 0) {
                arr[j] = i;
                System.out.println("arr[j] + " + arr[j]);
                frequencyArr[i]--;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        // Integer[] integerArr = {5, 4, 1, 3, 2};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // inBuildSort(integerArr);
        // counterSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
