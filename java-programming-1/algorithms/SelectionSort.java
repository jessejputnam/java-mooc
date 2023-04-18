import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIdx = indexOfSmallestFrom(arr, i);
            swap(arr, i, smallestIdx);
        }
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIdx = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIdx = i;
            }
        }

        return smallestIdx;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int hold = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = hold;
        System.out.println(Arrays.toString(arr));
    }
}
