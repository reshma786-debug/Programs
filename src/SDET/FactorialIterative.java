package SDET;

public class FactorialIterative {

	public static void main(String[] args) {
		int howManyFactorial = 5;
		int factorial = 1;
		for (int i = 0; i <=howManyFactorial; i++) {
			factorial += factorial * i;
		}
		System.out.println("Factorial: " + factorial);

		System.out.println("Recursive Method");
		factorial = 1;
		howManyFactorial = 5;
		while (howManyFactorial != 0) {
			factorial += factorial * howManyFactorial;
			howManyFactorial --;
		}
		System.out.println("Factorial: " + factorial);
		
		
		
		
	}

}
