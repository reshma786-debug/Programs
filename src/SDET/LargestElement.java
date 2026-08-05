package SDET;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 6, 89, 23};

        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Largest: " + max);
    }
}