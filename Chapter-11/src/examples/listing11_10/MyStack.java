package examples.listing11_10;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack {
    private ArrayList<Objects> list = new ArrayList<>();

    public boolean isEmty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }

    public void push(Object o) {
        list.add((Objects) o);
    }

    public String toString () {
        return "Stack is : "+list.toString();
    }
}
