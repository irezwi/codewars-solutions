import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        int N = new Integer(n.toString());
        BigInteger sum = BigInteger.valueOf(0);
        for(BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i.add(BigInteger.ONE)) {
            sum = sum.add(fibIteration(i));
            System.out.println(i + " " + sum);
        }
        return sum.multiply(new BigInteger("4"));
    }

    public static BigInteger fibonacciSequence(int n) {
        if(n == 0 || n == 1)
            return BigInteger.ONE;
        else
            return fibonacciSequence(n-1).add(fibonacciSequence(n-2));
    }

    public static BigInteger fibIteration(BigInteger n) {
        BigInteger x = BigInteger.ONE;
        BigInteger y = BigInteger.ONE;
        BigInteger z = BigInteger.valueOf(2);
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i.add(BigInteger.ONE)) {
            x = y;
            y = z;
            z = x.add(y);
        }
        return x;
    }
}