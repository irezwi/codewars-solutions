import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackWardsPrimeTest {
    @Test
    void isPrimeTest1() {
        assertEquals(true, BackWardsPrime.isPrime(199));
    }

    @Test
    void isPrimeTest2() {
        assertEquals(true, BackWardsPrime.isPrime(991));
    }

    @Test
    void isBackwardsPrimeTest() {
        assertEquals(true, BackWardsPrime.isBackwardsPrime(199));
    }

    @Test
    void reverseIntTest() {
        assertEquals(991, BackWardsPrime.getReverseInt(199));
    }
}