class ImprovedFibonacci {
    final static int MAX_INDEX = 9;

    /** print out the first few Fibonacci numbers,
     *  counting them in the reverse order and
     *  marking evens with a '*'
     */

    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        String mark;

        System.out.println("1: " + hi);
        for (int i = MAX_INDEX;i >= 2; i--) {
            if (hi % 2 == 0)
                mark = " *";
            else
                mark = "";
            System.out.println(i + ": " + hi + mark);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
