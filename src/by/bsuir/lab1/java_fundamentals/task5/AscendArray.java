package src.by.bsuir.lab1.java_fundamentals.task5;

import java.util.Arrays;

import src.by.bsuir.lab1.java_fundamentals.utils.ArrayOperations;

public class AscendArray {
    /**
     * Сalculates the minimum number of numbers to be excluded
     * from the array to obtain an ascending sequence
     **/
    public static int getMinNumber(int[] array) {
        int[] counts = new int[array.length];
        Arrays.fill(counts, 1);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((counts[j] <= counts[i]) && (array[j] >= array[i])) {
                    counts[j] = counts[i] + 1;
                }
            }
        }

        int minNumberToDrop = array.length - ArrayOperations.getMax(counts);
        return minNumberToDrop;
    }
}
