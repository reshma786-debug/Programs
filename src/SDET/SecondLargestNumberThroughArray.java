package SDET;

import java.util.Arrays;

public class SecondLargestNumberThroughArray {

	public static void main(String[] args) {
		int[] arrayNumbers = { 22, 44, 66, 2 };
		Arrays.sort(arrayNumbers);
		for (int i = 0; i <= arrayNumbers.length - 1; i++) {
			if (i == 1) {
				System.out.print("Print :" + arrayNumbers[i]);
				break;
			}
		}
		
		
	}
}