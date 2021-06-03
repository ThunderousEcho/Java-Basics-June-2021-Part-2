
public class Assignment2 {

	public static void main(String[] args) {

		int[][] m = new int[][] {
			new int[] {0, 8, 2, 10},
			new int[] {12, 4, 14, 6},
			new int[] {3, 11, 1, 9},
			new int[] {15, 7, 13, 5}
		};
		
		int max = -1;
		int xOfMax = -1;
		int yOfMax = -1;
		
		for (int y = 0; y < m.length; y++) {
			int[] row = m[y];
			for (int x = 0; x < row.length; x++) {
				int value = row[x];
				if (value > max) {
					max = value;
					xOfMax = x;
					yOfMax = y;
				}
			}
		}
		
		System.out.println("Max value was " + max + " at row " + yOfMax + ", column " + xOfMax + ".");
	}
}
