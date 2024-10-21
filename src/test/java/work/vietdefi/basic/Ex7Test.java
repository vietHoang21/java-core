package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex7Test {
    @Test
    @DisplayName("find biggest number")
    public void find1() {
        Ex7 ex7 = new Ex7();
        int[] test = {2,1,3,5,9,1,8};
        assertEquals(ex7.findBiggestNumber(test),9);
    }
    @Test
    @DisplayName("find biggest number if array has negative number")
    public void find2() {
        Ex7 ex7 = new Ex7();
        int[] test = {2,-1,3,5,6,1,8};
        assertEquals(ex7.findBiggestNumber(test),0);
    }
}
