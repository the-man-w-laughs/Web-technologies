package src.by.bsuir.lab1.java_fundamentals.task2;

public class Area {

    /**
     * Determines if a point is inside a shaded area
     * 
     * @param x first coordinate
     * @param y second coordinate
     */
    public static boolean checkPoint(float x, float y) {
        return ((y <= 5) && (y >= 0) && (Math.abs(x) <= 4)) || ((y < 0) && (y >= -3) && (Math.abs(x) <= 6));
    }
}
