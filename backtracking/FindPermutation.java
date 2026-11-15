package backtracking;

public class FindPermutation {

    static void findPermutation(String str, String ans){
        // Base case
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);

            // Call the findPermutation exclude the current picked character
            findPermutation(newString,ans+currentChar);
        }
    }

    static void main(String[] args) {
        findPermutation("abc","");
    }
}
