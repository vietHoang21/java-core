package work.vietdefi.basic;

public class Ex7 {
    /**
     * Find the biggest positive number in array
     *
     * @param arr Array positive integer number
     * @return biggest number
     */
    public int findBiggestNumber(int[] arr){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] < 0) return 0;
        }
        int max = arr[0];
//        {2,1,3,5,9,1,8}
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        return  max;
    }
}
