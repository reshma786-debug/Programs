package SDET;

import java.util.Map;
import java.util.HashMap;

public class CountCharViaCollection {

	public static void main(String[] args) {
		Map<Character, Integer> mapCount = new HashMap<>();
		String name = "automation";
		char[] characterToIterate = name.toCharArray();
		for (char c : characterToIterate) {
			if (mapCount.containsKey(c)) {
				mapCount.put(c, mapCount.get(c) + 1);
			} else {
				mapCount.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> textToCheckCount : mapCount.entrySet()) {
			System.out.println("Print > " + textToCheckCount.getKey() + ":" + textToCheckCount.getValue());
		}

		System.out.println("The Value more the 1:");
		for (Map.Entry<Character, Integer> textToCheckCount : mapCount.entrySet()) {
			if (textToCheckCount.getValue() > 1) {
				System.out.println("Print > " + textToCheckCount.getKey() + ":" + textToCheckCount.getValue());
			}
		}

		System.out.println("Different approach:");
		String str = "automation";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

	}

}