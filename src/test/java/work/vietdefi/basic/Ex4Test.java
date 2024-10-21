package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex4Test {
    @Test
    @DisplayName("Test value at f(2)")
    public void testF2() {
        Ex4 ex4 = new Ex4();
        assertEquals(ex4.fibonacci(2), 1);
    }

    @Test
    @DisplayName("Test value at f(11)")
    public void testF11() {
        Ex4 ex4 = new Ex4();
        assertEquals(ex4.fibonacci(11), 89);
    }
}
