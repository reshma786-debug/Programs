package SDET;

import java.util.*;

public class SmallestNumberViaCollection {

	public static void main(String[] args) {
		int[] c = { 1, 2, 3, 0, 4 };
		Set<Integer> test = new HashSet<Integer>();
		for (int i = 0; i <= c.length - 1; i++) {
			test.add(c[i]);
		}
		Integer first = test.iterator().next();
		System.out.println("Print :" + first);
	}

}