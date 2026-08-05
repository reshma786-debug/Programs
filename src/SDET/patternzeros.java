package SDET;

public class patternzeros {

	public static void main(String[] args) {
		int num = 5;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
//				if(i==1) {
//					System.out.print("1");
//				}else {
//				if (j%2 == 0) {
//					System.out.print("1");
//				} else {		
//					System.out.print("0");
//				}
//				}

				if (j % i == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}

			}
			System.out.println("");// for next line
		}

	}

}
