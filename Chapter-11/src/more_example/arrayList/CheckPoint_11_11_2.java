package more_example.arrayList;

import java.util.ArrayList;

public class CheckPoint_11_11_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
        //list.add(new java.util.Date()); not allowed because Date object not type of String
        String city = list.get(0);
        list.set(1, "Dallas"); // set means edit if index 2 then exception will throw

        System.out.println(list.toString());
    }
}
