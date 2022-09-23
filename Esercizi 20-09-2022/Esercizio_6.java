public class Esercizio_6 {

	public static void main(String[] args) {
		for(int i = 1; i < 7; i++) {
			for(int c = 1; c <= i; c++) {
				System.out.print(c);
			}
			System.out.print("   ");
			for(int k = 7-i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
