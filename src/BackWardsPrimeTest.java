import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackWardsPrimeTest {
    @Test
    void isPrimeTest1() {
        assertEquals(false, BackWardsPrime.isPrime(34));
    }

    @Test
    void isPrimeTest2() {
        assertEquals(true, BackWardsPrime.isPrime(31));
    }

}