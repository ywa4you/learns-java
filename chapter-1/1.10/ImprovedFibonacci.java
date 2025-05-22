class ImprovedFibonacci {
	final static int MAX_INDEX = 9;
	static FibonacciNumber[] values = new FibonacciNumber[MAX_INDEX];

	/** print out the first few Fibonacci numbers,
	*	counting them in the reverse order and
	*	marking evens with a '*'
	*/

	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		String mark;

		values[0] = new FibonacciNumber();
		values[0].number = hi;

		for (int i = 1; i < MAX_INDEX; i++) {
			values[i] = new FibonacciNumber();
			values[i].number = hi;
			if (values[i].number % 2 == 0)
				values[i].isEven = true;
			hi = lo + hi;
			lo = hi - lo;
		}

		for (int i = 0; i < values.length; i++) {
			mark = "";
			if (values[i].isEven)
				mark = " *";
			System.out.println(i+1 + ": " + values[i].number + mark);
		}
	}
}
