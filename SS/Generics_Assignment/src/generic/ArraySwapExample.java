package generic;

import java.util.Arrays;

public class ArraySwapExample {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};

        // Swap elements in the integer array
        swapElements(intArray, 1, 3);
        System.out.println("Integer Array after swapping: " + Arrays.toString(intArray));

        // Swap elements in the string array
        swapElements(stringArray, 0, 4);
        System.out.println("String Array after swapping: " + Arrays.toString(stringArray));
    }
}