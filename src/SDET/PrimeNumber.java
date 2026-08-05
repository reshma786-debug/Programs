package SDET;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to check Prime:");
		int intNum = sc.nextInt();
		boolean flag = true;
		// We start the loop from 2 because every integer is divisible by 1, so checking
		// 1 doesn't help determine whether a number is prime
		// A Prime Number has two factors:
		// Has exactly two factors: 1 and itself.
		// Is not divisible by any number between 2 and n - 1
		if (intNum <= 1) {
			flag = false;
		} else {
			for (int i = 2; i < intNum; i++) {
				if (intNum % i == 0) { // is exactly divisible by i
					flag = false;
					break;
				}
			}
		}

		if (flag)
			System.out.println("Given Number is Prime Number");
		else
			System.out.println("Given Number is not an Prime Number");

		sc.close();
	}

}