public class PascalsTriangle {
    public static int[][] pascal(int depth) {
        int[][] result = new int[depth][];
        for (int i = 0; i < depth; i++) {
            int[] row = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                row[j] = getNewtonSymbolValue(i, j);
            }
            result[i] = row;
        }
        return result;
    }

    private static int getNewtonSymbolValue(int n, int k) {
        int result = 1;
        int i;
        for (i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }
}
