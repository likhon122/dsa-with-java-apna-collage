package arrayList;

import java.util.ArrayList;

public class MultiDimensionalArrayList {

    static void makeTable(ArrayList<ArrayList<Integer>> lists, int numOfTable){
        for (int i = 1; i <= numOfTable; i++){
            lists.add(new ArrayList<>());
            for (int j = 1; j <= 5; j++){
                lists.get(i-1).add(i*j);
            }
        }
    }

    static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        makeTable(lists,3);
        System.out.println(lists);
    }
}
