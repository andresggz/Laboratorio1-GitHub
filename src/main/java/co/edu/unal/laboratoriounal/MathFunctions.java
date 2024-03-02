package co.edu.unal.laboratoriounal;

public class MathFunctions {
    
    public static int getSummation (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
