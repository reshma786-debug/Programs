package SDET;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int [] c = {1,2,3,0,4};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
        int i=0;
		System.out.println("Smallest Number: "+ c[i]);
	}

}