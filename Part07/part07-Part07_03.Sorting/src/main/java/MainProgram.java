
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int index) {
        int smallestIndex = index;

        for (int i = index; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int backupValue = array[index1];
        array[index1] = array[index2];
        array[index2] = backupValue;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexSmall = indexOfSmallestFrom(array, i);
            swap(array, i, indexSmall);
        }

    }

}

/*
    Examine o array a partir do índice 0.
Troque os dois números seguintes entre si: o número no índice 0 e o menor número no array a partir do índice 0.
    Examine a matriz a partir do índice 1. Troque os dois números seguintes entre si: o número no índice 1 e o menor número na matriz a partir do índice 1.

    Examine o array a partir do índice 2. Troque os dois números seguintes entre si: o número no índice 2 e o menor número no array a partir do índice 2.
    Etc.

 */
