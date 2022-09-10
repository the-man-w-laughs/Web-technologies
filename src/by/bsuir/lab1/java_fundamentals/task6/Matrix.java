package src.by.bsuir.lab1.java_fundamentals.task6;

public class Matrix {
    /**
     * Returns two-dimencional array from one-dimencional array
     **/
    public static float[][] getMatrix(float[] array) {
        float[][] resultArray = new float[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                resultArray[i][j] = array[(i + j) % (array.length)];
            }
        }
        return resultArray;
    }
}
