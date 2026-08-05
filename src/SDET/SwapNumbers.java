package SDET;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int temp = 0;
		System.out.println("Before : " + a + "," + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap : " + a + "," + b);

		// without third variable
		int x = 10, y = 20;
		System.out.println("Before : " + x + "," + y);
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swap : " + x + "," + y);
	}

}
