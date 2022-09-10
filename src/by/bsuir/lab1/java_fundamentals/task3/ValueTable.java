package src.by.bsuir.lab1.java_fundamentals.task3;

public class ValueTable {
    /**
     * Calculates value using formula from a to b with step h
     */
    public static float[][] getTable(float a, float b, float h) {
        int tableSize = (int) ((b - a) / h);
        float[][] table = new float[tableSize][2];
        int i = 0;
        while (i < tableSize) {
            table[i][0] = a;
            table[i][1] = (float) Math.tan(a);
            a += h;
            i++;
        }
        return table;
    }
}
