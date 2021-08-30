
public class main {

	public static void main(String[] args) {
		
		System.out.println("The nthTerm of the fibonacciSequence is: " + fibonacciSequence(10));

	}
	
	/**
	 * A method that runs recursively and solves the fibonacciSequence for the nthTerm it adds n - 1 + n - 2 until the nthTerm is found.
	 * @param n (The number we will use to find the nthTerm)
	 * @author James Purvis
	 * @return nthTerm  (The sum of the digits used to make n)
	 */
	
	public static int fibonacciSequence(int n)
	{
		if (n <= 1)
		{
			return n;
		}
		
	  return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
	}

}
