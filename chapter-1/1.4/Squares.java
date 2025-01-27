class Squares {
    /** Print out a sequence of Squares for values < 50 */
    public static void main(String[] args) {
        int num = 1;        // number to print the square of

        System.out.println("Squares of the first few numbers:");
        while (num*num < 50) {
            System.out.println(num * num);
            num = num + 1;
        }
    }
}
