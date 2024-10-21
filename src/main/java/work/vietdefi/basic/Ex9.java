package work.vietdefi.basic;

public class Ex9 {
    /**
     * Sort the given array using bubble sort
     *
     *  @param arr the Integer number array
     *   arr[2,4,1,5,3]
     *
     *  @return the array after sorted
     */
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

//    public static void main(String[] args) {
//        int[] test = {1,5,1,2,3,8,6};
//        System.out.println(bubbleSort(test));
//    }
}

