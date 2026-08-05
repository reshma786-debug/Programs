package SDET;

import java.util.*;

public class secondLargest {

	public static void main(String[] args) {
		int[] arr1 = { 10, 63, 54, 55 };

//		for (int i = 0; i < arr1.length - 1; i++) {
//			for (int j = 0; j < arr1.length - 1; j++) {
//				if (arr1[j] < arr1[j + 1]) {
//					int temp =arr1[j];
//					arr1[j ] = arr1[j+1];
//					arr1[j+1]=temp;
//					
//				}
//			}
//		}

		//System.out.println(Arrays.toString(arr1));

		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[2]);

	}

}
