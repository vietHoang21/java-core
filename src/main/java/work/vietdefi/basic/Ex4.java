package work.vietdefi.basic;

public class Ex4 {
    /**
     * Find value fibonacci number at position n.
     *
     * @param n the position to check
     * @return value of position at f(n)
     */
    public long fibonacci(int n){
        if (n < 0) return -1;
        if (n ==0) return  0;
        if (n == 1 && n ==2) return  1;
        long fn = 0, fn0 =0, fn1 = 1, fn2 = 1;
        for (int i = 1; i < n; i++){
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
        }
        return fn = fibonacci(n -1) + fibonacci(n -2);
    }

//    public static void main(String[] args) {
//        System.out.println(fibonacci(13));
////        long fn0 =0, fn1 = 1, fn2 = 1;
////        for (int i = 1; i < 15; i++){
////            long fn = fn1 + fn2;
////            fn1 = fn2;
////            fn2 = fn;
////            System.out.println(fn);
////        }
//
//    }
}
