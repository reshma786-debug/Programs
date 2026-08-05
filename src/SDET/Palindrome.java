package SDET;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);String newText = "";
		System.out.print("Enter the text to check Palindrome :"); //madam =madam
		String text = sc.next();

		for (int i = text.length() - 1; i >= 0; i--)
			newText += text.charAt(i);

		if (text.equals(newText))
			System.out.println("Palindrome");
		else
			System.out.println("Not an Palindrome");
		
		sc.close();
	}

}
