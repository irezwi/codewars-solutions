import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger sum = BigInteger.valueOf(0);
        for(BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            sum = sum.add(fibIteration(i));
        }
        return sum.multiply(new BigInteger("4"));
    }

    private static BigInteger fibIteration(BigInteger n) {
        BigInteger x = BigInteger.ONE;
        BigInteger y = BigInteger.ONE;
        BigInteger z = BigInteger.valueOf(2);
        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            x = y;
            y = z;
            z = x.add(y);
        }
        return x;
    }
}