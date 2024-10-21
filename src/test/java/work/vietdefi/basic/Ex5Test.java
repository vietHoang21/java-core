package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex5Test {
    @Test
    @DisplayName("test string hoang")
    public void testReverseString() {
        Ex5 ex5 = new Ex5();
        String test = "hoang";
        String actual = "gnaoh";
        assertEquals(ex5.reverse(test), actual);
    }
    @Test
    @DisplayName("test string if null")
    public void testReverseString1() {
        Ex5 ex5 = new Ex5();
        String test = "";
        String actual = null;
        assertEquals(ex5.reverse(test), actual);
    }
    @Test
    @DisplayName("test string if have space")
    public void testReverseString2() {
        Ex5 ex5 = new Ex5();
        String test = "al o";
        String actual = "o la";
        assertEquals(ex5.reverse(test), actual);
    }
}
