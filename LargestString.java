public class LargestString {

    // Find the largest string in lexicographical order
    public static void findLargestString(String[] strArr){ // Time complexity is O(nx) -> n is length of strArr and x is the string length
        String largestString = strArr[0];
        for (int i = 1; i<strArr.length; i++){
            if(largestString.compareTo(strArr[i]) < 0){
                largestString = strArr[i];
            }
        }

        System.out.println("Largest string is: "+ largestString);
    }

    static void main(String[] args) {
        String[] strArr = {"apple","mango","banana"};
        findLargestString(strArr);
    }
}
