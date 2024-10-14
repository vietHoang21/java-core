package work.vietdefi.basic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class Ex2Test {


    @Test
    @DisplayName("Test sum")
    public void testSum() {
        //TODO: implement this
        Ex2 ex2 = new Ex2();
        assertEquals(ex2.sum(5), 15);
    }

    @Test
    @DisplayName("Test sum if input < 0")
    public void testSum2() {
        Ex2 ex2 = new Ex2();
        assertEquals(ex2.sum(-5), 0);
    }

    @Test
    @DisplayName("Test sum if input = 0")
    public void testSum3() {
        //TODO: implement this
        Ex2 ex2 = new Ex2();
        assertEquals(ex2.sum(0), 0);
    }

    @Test
    @DisplayName("Test sum if input = 1")
    public void testSum4() {
        //TODO: implement this
        Ex2 ex2 = new Ex2();
        assertEquals(ex2.sum(1), 1);
    }
}
