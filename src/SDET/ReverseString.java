package SDET;


public class ReverseString {

	public static void main(String[] args) {
		String text = "reverse";
		String output = "";
		char[] c = text.toCharArray();
		int i = c.length - 1;
		while (i >= 0) {
			output += String.valueOf(c[i]);
			i--;
		}
		System.out.println(output);

		String outputDifferentApproach = "";
		for (int j = text.length() - 1; j >= 0; j--) {
			outputDifferentApproach += String.valueOf(text.charAt(j));
		}
		System.out.println(outputDifferentApproach);
		
	
		StringBuilder build = new StringBuilder(text);
		build.reverse();
		System.out.println(build);
		
		StringBuffer buffer = new StringBuffer(text);
		buffer.reverse();
		System.out.println(buffer);
	}
}
