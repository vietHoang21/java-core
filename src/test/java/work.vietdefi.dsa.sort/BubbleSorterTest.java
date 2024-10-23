package work.vietdefi.dsa.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSorterTest {
    @Test
    @DisplayName("bubble sort")
    public void sort() {
        Sorter sorter = new BubbleSorter();
        int[] test = {28,1,8,18,24,72,80,73,14,55};
        int[] actualArray = {1,8,14,18,24,28,55,72,73,80};
        assertArrayEquals(sorter.sort(test), actualArray);
    }
}
