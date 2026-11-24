package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater {

//    Brute force O(n^2)
    static int bruteForceCalculate(ArrayList<Integer> height){
        int mostWater = Integer.MIN_VALUE;

        for (int i = 0; i < height.size(); i++){
            for (int j = 1; j < height.size(); j++){
               int smallHeight = height.get(j) < height.get(i) ? height.get(j) : height.get(i);
               int width = j - i;
               int containerWater = smallHeight * width;
               if(containerWater > mostWater){
                   mostWater = containerWater;
               }
            }
        }

        return mostWater;
    }

//    Using 2 Pointer approach
    static int twoPointerCalculate(ArrayList<Integer> heightList){
        int maxWater = Integer.MIN_VALUE;
        int leftPointer = 0;
        int rightPointer = heightList.size() - 1;

        while (leftPointer<= rightPointer){
            int smallHeight =  Math.min(heightList.get(leftPointer), heightList.get(rightPointer));
            int width = rightPointer - leftPointer;

            int containerWater = smallHeight * width;

            if(containerWater > maxWater){
                maxWater = containerWater;
            }

            if(heightList.get(leftPointer) > heightList.get(rightPointer)){
                rightPointer--;
            }else {
                leftPointer ++;
            }
        }

        return maxWater;
    }

    static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(List.of(1,8,6,2,5,4,8,3,7));
        System.out.println(twoPointerCalculate(height));
    }


}
