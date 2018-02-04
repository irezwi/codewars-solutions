public class BackWardsPrime {
    public static String backwardsPrime(long start, long end) {


        return "a";
    }

    static boolean isPrime(long number) {
        for(int i = 2; i < number; i++) {
            if(number%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
