package src.by.bsuir.lab1.java_fundamentals;

//import src.by.bsuir.lab1.java_fundamentals.*;
import src.by.bsuir.lab1.java_fundamentals.task1.Formula;
import src.by.bsuir.lab1.java_fundamentals.task2.Area;
import src.by.bsuir.lab1.java_fundamentals.task3.ValueTable;
import src.by.bsuir.lab1.java_fundamentals.task4.PrimeArray;
import src.by.bsuir.lab1.java_fundamentals.task5.AscendArray;
import src.by.bsuir.lab1.java_fundamentals.task6.Matrix;
import src.by.bsuir.lab1.java_fundamentals.task7.Sorter;
import src.by.bsuir.lab1.java_fundamentals.task8.Arrays;
import src.by.bsuir.lab1.java_fundamentals.utils.ArrayOperations;

public class Application {
    public static void main(String[] args) {
        // task 1
        System.out.printf("result 1: %.02f\n", Formula.getValue(1, 1));

        // task 2
        System.out.printf("result 2: %b\n", Area.checkPoint(6, 0));

        // task 3
        float[][] result3 = ValueTable.getTable(0, 11, 2);
        System.out.printf("result 3:\n");
        ArrayOperations.writeTwoDimensionalArray(result3);

        // task 4
        int[] array = new int[] { 5, 4, 3, 2, 1 };
        int[] result4 = PrimeArray.getPrimePositions(array);
        System.out.printf("result 4:\n");
        for (int value : result4)
            System.out.printf(" %d", value);
        System.out.println();

        // task 5
        System.out.printf("result 5: %d\n", AscendArray.getMinNumber(array));

        // task 6
        float[] floatArray = new float[] { 1, 2, 3, 4, 5 };
        float[][] result6 = Matrix.getMatrix(floatArray);
        System.out.println("result 6:");
        ArrayOperations.writeTwoDimensionalArray(result6);

        // task 7
        floatArray = new float[] { 5, 4, 3, 2, 1 };
        Sorter.sort(floatArray);
        System.out.println("result 7:");
        for (float value : floatArray)
            System.out.printf(" %.2f", value);
        System.out.println();

        // task 8
        int[] ascendingArray1 = new int[] { 1, 20, 32, 46, 52, 60 };
        int[] ascendingArray2 = new int[] { 0, 3, 7, 9, 30, 45, 61 };
        int[] positions = Arrays.getPositions(ascendingArray1, ascendingArray2);
        System.out.println("result 8:");
        for (int value : positions)
            System.out.printf(" %d", value);
        System.out.println();
    }
}
