package SDET;

import java.util.*;

public class Roman{
    public static void main(String[] args) {

        String roman = "VII";
        int result = 0;

        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        for (int i = 0; i < roman.length(); i++) {
            int current = values.get(roman.charAt(i));

            if (i + 1 < roman.length() &&
                current < values.get(roman.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        System.out.println("Roman: " + roman);
        System.out.println("Integer: " + result);
    }
}