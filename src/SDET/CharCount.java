package SDET;

public class CharCount {

	public static void main(String[] args) {
		String text = "automation";
		int count = 0;
		for (int i = 0; i <= text.length() - 1; i++) {
			for (int j = i; j <= text.length() - 1; j++) {
				if (text.charAt(i) == text.charAt(j)) {
					count += 1;
				}
			}
			System.out.println("Print " + text.charAt(i) + ":" + count);
			count = 0;
			text = text.replaceAll(String.valueOf(text.charAt(i)), "");
			i = 0;
		}

	}

}