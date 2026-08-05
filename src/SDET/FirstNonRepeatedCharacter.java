package SDET;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String word = "automation";
		char firstChar = 0;
		int count = 0;
		for (int i = 0; i <= word.length() - 1; i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					count += 1;
				}
			}
			if (count == 1) {
				firstChar = word.charAt(i);
				break;
			}
			count = 0;
		}
		System.out.println("First Non Repeated Character: " + firstChar);
	}

}
