 package SDET;

import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number:");
		int intNum = sc.nextInt();

		boolean even = true;

		if (intNum <= 1) {
			even = false;
		} else {
			for (int i = 2; i < intNum; i++)
				if (intNum / i == 0) { //checks the result is zero
					even = false;
				}
		}

		if (even) {
			System.out.println("Even Number");
		} else {
			System.out.println("Not Even/ odd Number");
		}
		sc.close();

	}

}
