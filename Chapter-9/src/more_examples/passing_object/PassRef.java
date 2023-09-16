package more_examples.passing_object;

public class PassRef {
    public static void main(String[] args) {
        int [] a = {1 , 2};
        swap(a);
        System.out.println("a[0] : " + a[0] + " a[1] : " + a[1]);
    }

    // here pass by value so no swap
    public static void swap (int [] n) {
        int temp = n[0];
        n[0] = n[1];
        n[1] = temp;
    }
}
