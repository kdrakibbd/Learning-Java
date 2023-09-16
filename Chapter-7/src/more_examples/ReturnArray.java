package more_examples;

public class ReturnArray {
    public static void main(String[] args) {
        int [] array = { 1 , 2, 3, 4, 5};
        int [] revers;

        revers = revers(array);

        for (int a : revers)
            System.out.print(a + " ");
    }

    public static int[] revers (int [] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = result.length - 1;i < arr.length;i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }
}
