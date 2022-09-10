package src.by.bsuir.lab1.java_fundamentals.task8;

public class Arrays {
        /**
     * Method determines positions in ascendingArray1
     * to insert elements from ascendingArray2 so that
     * result array will be ascenging too.
     * 
     * @return positions array with length equal to length
     *         of ascendingArray2. It containes positions.
     */
    public static int[] getPositions(int[] ascendingArray1, int[] ascendingArray2) {
        int i = 0;
        int j = 0;
        int[] positions = new int[ascendingArray2.length];
        while (j < ascendingArray2.length) {
            if ((i >= ascendingArray1.length) || (ascendingArray2[j] <= ascendingArray1[i])) {
                positions[j] = i - 1;
                j++;
            } else {                
                i++;
            }        
        }
        return positions;
    }
}
