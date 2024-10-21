package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex10Test {
    @Test
    @DisplayName("Test if 6 is perfect")
    public void testPerfectNumber() {
        Ex10 ex10 = new Ex10();
        assertTrue(ex10.isPerfectNumber(6));
    }

    @Test
    @DisplayName("Test if 4 is perfect")
    public void testPerfectNumber1() {
        Ex10 ex10 = new Ex10();
        assertFalse(ex10.isPerfectNumber(4));
    }

    @Test
    @DisplayName("Test if -6 is perfect")
    public void testPerfectNumber2() {
        Ex10 ex10 = new Ex10();
        assertFalse(ex10.isPerfectNumber(-6));
    }
}
