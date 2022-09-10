package src.by.bsuir.lab1.java_fundamentals.task4;

import java.util.ArrayList;
import src.by.bsuir.lab1.java_fundamentals.utils.MathOperation;

public class PrimeArray {
    /**
     * Determines if array contains prime numbers and returns it's indexes
     */
    public static int[] getPrimePositions(int[] array) {
        ArrayList<Integer> primesIndexes = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (MathOperation.checkIsNumberPrime(array[i])) {
                primesIndexes.add(i + 1);
            }
        }

        return primesIndexes.stream().mapToInt(i -> i).toArray();
    }
}
