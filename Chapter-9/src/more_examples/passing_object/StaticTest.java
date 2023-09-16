package more_examples.passing_object;

class T2 {
    static int i = 0;
    int j = 0;

    T2 () {
        i++;
        j = 1;
    }
}

public class StaticTest {
    public static void main(String[] args) {
        T2 t1 = new T2(); // t1 : j = 1 , i = 1
        T2 t2 = new T2(); // t2 : j = 1 , i = 2

        System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " + t2.i + " and j = " + t2.j);
    }
}
