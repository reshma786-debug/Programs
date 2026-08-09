package SDET;

public class EmptyTraingle {

	public static void main(String arg[]) {
		int num = 6;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <=i*2-1; k++) {
				System.out.print("j");
			}
			
			System.out.println("");
		}
	}
}
