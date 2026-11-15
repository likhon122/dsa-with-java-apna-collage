package backtracking;

public class FindSubsets {

    static void subsets(String str , String ans, int i){
        // Base case
        if(str.length() == i){
            if(ans.isEmpty()) {
                System.out.print("null");
            } else{
                System.out.print(ans + ", ");
            }
            return;
        }

        // Recursive work
        // Yes choice
        subsets(str,ans+str.charAt(i),i+1);

        // No Choice // Backtracking choice no
        subsets(str,ans, i+1);
    }

    static void main(String[] args) {
        subsets("abc","",0);
    }
}
