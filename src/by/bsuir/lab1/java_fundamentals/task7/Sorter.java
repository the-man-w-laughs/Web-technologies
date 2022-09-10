package src.by.bsuir.lab1.java_fundamentals.task7;

public class Sorter {
    /*
     * Shell sort
     */

    public static void sort(float[] array) {
        int i = 0;
        float temp;
        while (i < array.length - 1) {
            if (array[i] < array[i + 1]) {
                i++;
            } else {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0)
                    i--;
            }
        }
    }
}
