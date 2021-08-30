
public class main {

	public static void main(String[] args) {
		
		System.out.println("The nthTerm of the fibonacciSequence is: " + fibonacciSequence(10));

	}
	
	public static int fibonacciSequence(int n)
	{
		if (n <= 1)
		{
			return n;
		}
		
	  return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
	}

}
