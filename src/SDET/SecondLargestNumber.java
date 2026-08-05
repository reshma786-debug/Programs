package SDET;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arrayNumbers = { 22, 44, 66, 2 };
		for (int i = 0; i < arrayNumbers.length - 1; i++) {
			for (int j = 0; j < arrayNumbers.length - 1 ; j++) {
				if (arrayNumbers[j] > arrayNumbers[j + 1]) {
					int temp = arrayNumbers[j];
					arrayNumbers[j] = arrayNumbers[j + 1];
					arrayNumbers[j + 1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(arrayNumbers));
	}
}