package SDET;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;

		System.out.print("Fibanocci " + i + "," + j);

		for (int k = 0; k <= 5; k++) {
			int l = i + j;
			System.out.print("," + l);
			i = j;
			j = l;
		}

	}

}
