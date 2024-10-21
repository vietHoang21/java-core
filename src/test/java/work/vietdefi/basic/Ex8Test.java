package work.vietdefi.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex8Test {
    @Test
    @DisplayName("check 12321")
    public void testString() {
        Ex8 ex8 = new Ex8();
        String test = "12321";
        assertTrue(ex8.isPalindrome(test));
    }

    @Test
    @DisplayName("check hello world")
    public void testString1() {
        Ex8 ex8 = new Ex8();
        String test = "hello world";
        assertFalse(ex8.isPalindrome(test));
    }

    @Test
    @DisplayName("check 123021")
    public void testString2() {
        Ex8 ex8 = new Ex8();
        String test = "123021";
        assertFalse(ex8.isPalindrome(test));
    }
}
