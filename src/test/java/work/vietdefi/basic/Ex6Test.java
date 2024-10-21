package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {
    @Test
    @DisplayName("calculate 3")
    public void testFactorial1() {
        Ex6 ex6 = new Ex6();
        assertEquals(ex6.factorial(3), 6);
    }

    @Test
    @DisplayName("calculate -1")
    public void testFactorial2() {
        Ex6 ex6 = new Ex6();
        assertEquals(ex6.factorial(-1), 0);
    }

}
