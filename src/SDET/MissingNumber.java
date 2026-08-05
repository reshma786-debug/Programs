package SDET;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = { 1, 3, 4, 5 };
		int n = num.length + 1;
		int expected = n * (n + 1) / 2;
		System.out.println("Expected : " + expected);
		int actual = 0;
		for (int x : num) {
			actual += x;
		}
		System.out.println("Actual : " + actual);
		System.out.println("Missing Number: " + (expected - actual));

		System.out.println("Different approach");
		int[] arr = { 1, 2, 3, 5 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println("Missing Number: " + (i + 1));
				break;
			}
		}
	}
}
