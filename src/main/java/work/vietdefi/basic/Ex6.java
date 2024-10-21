package work.vietdefi.basic;

public class Ex6 {
    /**
     * Calculates the factorial of 1 positive integer number
     *
     * @param input integer number
     * @return value factorial of input number
     */
    public long factorial(int input){
        if (input < 0) return 0;
        long result = 1;
        for (int i = 1; i<= input; i++){
            result *= i;
        }
        return result;
    }
}
