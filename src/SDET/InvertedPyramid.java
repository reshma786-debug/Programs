package SDET;

public class InvertedPyramid {

	public static void main(String[] args) {

		// Inverted Pyramid

		int num = 6;
		for (int i = 1; i < num; i++) {
			for (int K = 1; K <= num - i; K++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		for (int i = num; i >= 1; i--) {
			for (int K = num - i; K >= 1; K--) {
				System.out.print(" ");
			}
			for (int j = (2 * i) - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
