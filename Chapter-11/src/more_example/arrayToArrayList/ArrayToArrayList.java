package more_example.arrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // making array to ArrayList
        String [] array = {"Sumon", "Rakib", "Jomir"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        // making ArrayList to Array
        String [] array1 = new String[list.size()];
        list.toArray(array1);

        // sort a list
        Integer [] numArray1 =  {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> numList1 = new ArrayList<>(Arrays.asList(numArray1));
        Collections.sort(numList1);
        System.out.println(numList1);

        // max min list
        Integer[] numArray2 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> numList2 = new ArrayList<>(Arrays.asList(numArray2));
        System.out.println(Collections.max(numList2));
        System.out.println(Collections.min(numList2));

        // shuffle
        Integer[] numArray3 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> numList3 = new ArrayList<>(Arrays.asList(numArray3));
        Collections.shuffle(numList3);
        System.out.println(numList3);
    }
}
