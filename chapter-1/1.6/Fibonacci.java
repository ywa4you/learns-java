class Fibonacci {
    final static String STR = "First few terms of the Fibonacci sequence:";
    /** Print out the Fibonacci sequence for values < 50 */
    public static void main(String[] args) {
        int lo = 1,     // previous term
            hi = 1;     // current term

        System.out.println(STR);
        System.out.println(lo);
        while (hi < 50) {
            System.out.println(hi);
            hi = lo+hi;     // new hi
            lo = hi-lo;     /* new lo is (sum - old lo) that is, the old hi */
        }
    }
}
