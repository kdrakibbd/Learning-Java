package more_examples;

public class ReturnStatement {
    public static void main(String[] args) {
        int n = 2;
        sign(n);
    }

    public static int sign(int n) {
        if (n > 0)
            return 1;
        else if (n == 0)
            return 0;
        else if (n < 0)
            return -1;
    }
}
