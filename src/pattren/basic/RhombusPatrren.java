package pattren.basic;

public class RhombusPatrren {
	
	public static void main(String[] args) {
		int row = 5 ;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
