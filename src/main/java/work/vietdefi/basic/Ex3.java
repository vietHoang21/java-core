package work.vietdefi.basic;

public class Ex3 {
    /**
     * Determines if the given number is prime number.
     *
     * @param input the number to check
     * @return true if the input is prime; false if the input is not prime
     */
    public boolean isPrimeNumber(int input) {
        if (input <= 1) return false;
        for (int i = 2; i <=  input/2; i++) {
            if (input % i == 0 ){
                return false;
            }
        }
        return true;
    }
}

