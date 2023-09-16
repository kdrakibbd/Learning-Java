package more_examples;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int [] array = { 5, 3, 2, 6, 6, 2, 6, 7 };
        int[] numbers = { 6, 4, 1, 2, 3, 3, 5, 3, 1 };

        System.out.print("Before the sorting : ");
        printArray(array);

        // whole array sort
        System.out.println("After the sorting : ");
        Arrays.sort(array);
        printArray(array);
        Arrays.parallelSort(array);
        printArray(array);

        // partial sort
        System.out.print("Sort using partial : ");
        Arrays.parallelSort(numbers, 1, 8);
        printArray(numbers);

        // binary search
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " + Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " + Arrays.binarySearch(list, 12));

        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " + java.util.Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index is " + java.util.Arrays.binarySearch(chars, 't'));

        // equals
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false

        // filling
        int[] list4 = {2, 4, 7, 10};
        int[] list5 = {2, 4, 7, 7, 7, 10};
        Arrays.fill(list4, 5); // Fill 5 to the whole array
        printArray(list4);
        Arrays.fill(list5, 1, 5, 8); // Fill 8 to a partial array
        printArray(list5);

        // toString
        int[] list6 = {2, 4, 7, 10};
        System.out.println(Arrays.toString(list6));

        // check point
        int[] list7 = {2, 4, 7, 10};
        java.util.Arrays.fill(list7, 7);
        System.out.println(java.util.Arrays.toString(list7));
        int[] list8 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list8));
        System.out.print(java.util.Arrays.equals(list7, list8));
    }

    public static  void printArray (int[] a) {
        for (int array : a) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
