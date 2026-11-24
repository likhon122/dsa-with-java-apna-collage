package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class ArrayListLearn {

    static void swapTwoNumbers(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }


    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element O(1)
        list.add(1); // O(1)
        list.add(10);
        list.add(3);

//        list.add(1,10); // O(n)

//         Get Element O(1)
//        System.out.println(list.get(1));

//         Remove element O(n)
//        list.remove(1);
//        System.out.println(list);

//         Set element at index O(1)
//        list.set(2,4);
//        System.out.println(list);

//         Contains element O(n)
//        System.out.println(list.contains(1));

//        Print strait
//        for (int i =0; i<list.size(); i++){
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();

//        Reverse Print
//        for (int i = list.size() -1; i >= 0; i--){
//            System.out.print(list.get(i) + " ");
//        }

//        Print max
//        int max = Integer.MIN_VALUE;
//        for (Integer listNum : list) {
//            max = Math.max(max,listNum);
//        }
//        System.out.println(max);

        // Swap 2 numbers
//        swapTwoNumbers(list,1,2);
//        System.out.println(list);

//        Sort using Collections framework
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

//        Sort descending order using Comparator.
//        Comparator is fix logic function
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }

}
