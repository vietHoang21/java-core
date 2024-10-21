package work.vietdefi.basic;


public class Ex8 {
    /**
     * checks whether a string is a worthy argument
     *
     * @param input a string
     * @return true if correct, false if wrong
     */
    public boolean isPalindrome(String input) {
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
