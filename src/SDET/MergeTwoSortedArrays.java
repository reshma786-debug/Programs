package SDET;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 2 };
		int[] arr2 = { 0, 1, 2 };
		int[] arr3 = new int[arr1.length + arr2.length ];
		
		int i = 0;
		for (int n : arr1) {
			arr3[i] = n;
			i++;
		}
		for (int n : arr2) {
			arr3[i] = n;
			i++;
		}
		
		System.out.println(Arrays.toString(arr3));
	}

}
