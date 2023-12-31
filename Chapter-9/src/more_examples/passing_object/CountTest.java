package more_examples.passing_object;

class Count {
    public int count;

    public Count(int c) {
        count = c;
    }

    public Count() {
        count = 1;
    }
}

public class CountTest {
    public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;
        for (int i = 0; i < 100; i++)
            increment(myCount, times);

        System.out.println("count is " + myCount.count); System.out.println("times is " + times);
    }
    public static void increment(Count c, int times) {
        c.count++;
        times++;
    }
}
