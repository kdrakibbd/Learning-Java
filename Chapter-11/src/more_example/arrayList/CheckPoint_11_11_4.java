package more_example.arrayList;

import java.util.ArrayList;

public class CheckPoint_11_11_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(1); // here remove index 1 element : remove 2
        System.out.println(list);
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(1.0); // 1 not working
    }
}
