public class IsPalindrome {

    public static boolean isPalindrome(String string){
        int n = string.length();
        for (int i = 0; i < n/2; i++){
            if(string.charAt(i) != string.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        String string = "noon";
        boolean isPalindrome = isPalindrome(string);
        if(isPalindrome){
            System.out.println("Your string is palindrome");
        }else {
            System.out.println("Your string is not a palindrome");
        }
    }
}
