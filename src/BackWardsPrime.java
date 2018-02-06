class BackWardsPrime {
    private static String backwardsPrime(long start, long end) {
        StringBuilder result = new StringBuilder();
        for (long i = start; i <= end; i++) {
            if (isBackwardsPrime(i))
                result.append(i).append(" ");
        }
        if (result.length() > 2)
            result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    static boolean isPrime(long number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    static boolean isBackwardsPrime(long number) {
        return number >= 10 && isPrime(number) && isPrime(getReverseInt(number)) && (number != getReverseInt(number));
    }

    static long getReverseInt(long number) {
        if (number < 10)
            return number;
        long resultNumber = 0;
        for (long i = number; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        return resultNumber;
    }
}
