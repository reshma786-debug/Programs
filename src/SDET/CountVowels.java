package SDET;

import java.util.*;

public class CountVowels {

	public static void main(String[] args) {
		char[] check = { 'a', 'e', 'i', 'o', 'u' };
		String text = "reshma";
		char[] inputCheck = text.toCharArray();

		int k = 0;
		char[] output = new char[inputCheck.length - 1];

		for (int i = 0; i <= check.length - 1; i++) {
			for (int j = 0; j <= inputCheck.length - 1; j++) {
				if (check[i] == inputCheck[j]) {
					output[k] = inputCheck[j];
					k++;
				}
			}
		}
		System.out.println("Vowels present in given word: ");
		for (char c : output) {
			System.out.print(c+" ");
		}

	}

}
