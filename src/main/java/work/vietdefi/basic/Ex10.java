package work.vietdefi.basic;

public class Ex10 {
    /**
     * check if a number is a perfect number.
     *
     * @param input the number to check
     * @return true if the input is a perfect number; false if the input is not a perfect number
     */
    public static boolean isPerfectNumber(int input){
        if(input <= 1) return false;
        int sum = 0;
        for(int i=1;i<=input/2;i++){
            if(input%i==0)
                sum+=i;
        }
        if(sum==input)return true;
        return false;
    }
}
