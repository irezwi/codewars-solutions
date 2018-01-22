/* COMPLETED */

public class NthSeries {

    public static String seriesSum(int n) {
        double sum = 0.0;
        for(int i = 0, j = 1; i < n; i++, j += 3) {
            sum += 1.0/j;
        }
        return String.format("%.2f", sum);
    }
}
