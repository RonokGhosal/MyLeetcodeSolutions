public class MatrixNegativeNumbers {
	public static void main(String[] args) {
		int[][] grid = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(grid) );
	}

	public static  int countNegatives(int[][] grid) {
		int countNegatives  = 0;
		for (int r = 0; r< grid.length; r++) {
			for(int c=0; c< grid[0].length ; c++) {
				if (grid[r][c] < 0) {
					countNegatives ++ ;
				}
			}
		}
		return countNegatives;
	}
}
