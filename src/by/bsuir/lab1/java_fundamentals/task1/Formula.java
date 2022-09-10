package src.by.bsuir.lab1.java_fundamentals.task1;

public class Formula {

    /**
     * Calculates value using formula
     * 
     * @param x first parameter
     * @param y second parameter
     * @return f(x,y)
     */

    public static double getValue(float x, float y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) / (1 + Math.pow(x * y, 2)))) + x;
    }
}
