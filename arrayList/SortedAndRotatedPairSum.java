package arrayList;

import java.util.ArrayList;
import java.util.List;

public class SortedAndRotatedPairSum {

    static boolean pairSumTwoPointer(ArrayList<Integer> list, int targer){
        int breakingPoint = -1;
        int n = list.size();
        for(int i = 0; i < n; i++){
            if(i + 1 == n){
                breakingPoint = i;
                break;
            }
            if(list.get(i) > list.get(i+1)){
                breakingPoint = i;
                break;
            }
        }

        // Initialize the left and right pointer
        int lp = (breakingPoint + 1) % n;
        int rp = breakingPoint;

        // Find the pair
        while (lp != rp){
            int sum = list.get(lp) + list.get(rp);
            if(sum == targer) return true;

            if(sum > targer){
                rp = (n + (rp - 1)) % n;
            }else {
                lp = (lp + 1) % n;
            }
        }

        return false;
    }

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(11,15,6,8,9,10));
        System.out.println(pairSumTwoPointer(list,16));
    }
}
