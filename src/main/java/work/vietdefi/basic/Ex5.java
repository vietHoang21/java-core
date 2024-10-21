package work.vietdefi.basic;

public class Ex5 {
    /**
     * Reverse a string
     *
     * @param s  random string
     * @return new  string after Reverse
     */
    public static String reverse(String s){
        if (s == null || s.length() == 0) {
            return null;
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString.append(s.charAt(i));
        }
        return reverseString.toString();
    }

//    public static void main(String[] args) {
//        String s = "hoang";
//        System.out.println(reverse(s));
//    }
}
