public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] result = {};

        if (s.length == 0)
            return result;

        if (s.length < 4) {
            System.arraycopy(s, 0, result, 0, n);
            return result;
        }


        return result;
    }

    public double cT(double[] s, int n) {
        if (n == 0)
            return s[0];
        else if (n == 1)
            return s[1];
        else if (n == 2)
            return s[2];
        else
            return cT(s, n - 1) + cT(s, n - 2) + cT(s, n - 3);
    }
}
