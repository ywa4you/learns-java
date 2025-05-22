class Fibonacci {
	/** Print out the Fibonacci sequence for values < MAX_VALUE */
	public static void main(String[] args) {
		int lo = 1,					// previous term
			hi = 1;					// current term
		final int MAX_VALUE = 50;	// amount of numbers to be printed
		int[] values = new int[MAX_VALUE];

		values[0] = lo;

		for (int i = 1; hi < MAX_VALUE; i++) {
			values[i]  = hi;
			hi = lo+hi;		// new hi
			lo = hi-lo;		/* new lo is (sum - old lo) that is, the old hi */
		}

		System.out.println("First few terms of the Fibonacci sequence:");
		for (int i = 0; i < values.length; i++)
			if (values[i] != 0)
				System.out.println(values[i]);
	}
}
