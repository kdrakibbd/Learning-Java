package more_examples.passing_object;

public class PassValue {
    public static void main(String[] args) {
        int [] a = {1 , 2};
        swap(a[0], a[1]);
        System.out.println("a[0] : " + a[0] + " a[1] : " + a[1]);
    }

    // here pass by value so no swap
    public static void swap (int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
