package src.by.bsuir.lab1.java_fundamentals.utils;

/*
 * LaboratoryWork1
 *
 * Class contains specific methods that perform some mathematical operations
 */
public class MathOperation {

    public static boolean checkIsNumberPrime(int num) {
        {
            if (num <= 1) {
                return false;
            }
            if (num <= 3) {
                return true;
            }

            if (num % 2 == 0 || num % 3 == 0) {
                return false;
            }

            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
