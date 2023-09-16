package more_example.arrayList;

import java.util.ArrayList;

public class CheckPoint_11_11_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");

        System.out.println(list.toString());

        // remove fist Dallas
        list.remove("Dallas");

        System.out.println(list.toString());

        list.remove(1);

        System.out.println(list.toString());

    }
}
