package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex9Test {
    @Test
    @DisplayName("Sort array")
    public void sort() {
        Ex9 ex9 = new Ex9();
        int[] test = {2,1,3,5,9,1,8};
        int[] actualArray = {1,1,2,3,5,8,9};
        assertArrayEquals(ex9.bubbleSort(test), actualArray);
    }
}

