package arrayList;

import java.util.ArrayList;
import java.util.List;

public class PairSum {

    // Brute Force O(n^2)
    static boolean pairSumBruteForce(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = 1; j < list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

//    Using Two pointer O(n)
    static boolean pairSumTwoPointer(ArrayList<Integer> list, int target){
        int leftP = 0;
        int rightP = list.size() - 1;

        while (leftP != rightP){
            int sum = list.get(leftP) + list.get(rightP);

            if(sum == target) return true;

            if(sum > target){
                rightP--;
            }else {
                leftP++;
            }
        }

        return false;
    }

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(pairSumTwoPointer(list,11));
    }
}
