package pattren.basic;

public class HollowSquarePatrren {

	public static void main(String[] args) {
		int row = 7;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i == 0 || i == row-1 || j == 0|| j == row-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
