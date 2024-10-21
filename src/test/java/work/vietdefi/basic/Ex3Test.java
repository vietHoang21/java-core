package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex3Test {
    @Test
    @DisplayName("Test if 2 is prime")
    public void testTwoIsPrime() {
        Ex3 ex3 = new Ex3();
        assertTrue(ex3.isPrimeNumber(2));
    }

    @Test
    @DisplayName("Test if 1 is prime")
    public void testOneIsPrime() {
        Ex3 ex3 = new Ex3();
        assertFalse(ex3.isPrimeNumber(1));
    }

    @Test
    @DisplayName("Test if 13 is prime")
    public void test13IsPrime() {
        Ex3 ex3 = new Ex3();
        assertTrue(ex3.isPrimeNumber(13));
    }
}
