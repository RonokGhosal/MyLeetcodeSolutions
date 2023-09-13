import java.awt.print.Printable;

public class StraightLine {

	public static void main(String[] args) {
		// Use initialize syntax.
		int[][] coordinates = {{0,0}, {0,1}, {0,-1}};

		System.out.println( checkStraightLine(coordinates));
	}

// i - > 1-2, 2-3 , j->

	public static boolean  checkStraightLine(int[][] coordinates) {
		boolean isStraight = true;

		double xgradiant = coordinates[0][0] - coordinates[1][0];
		double ygradiant = coordinates[0][1] - coordinates[1][1];
		double origslope = ygradiant / xgradiant;

		System.out.println("Original Slope is " + origslope);
         int countSame = 0;
		outerloop:
		for (int i = 0; i < coordinates.length -1 ; i++) {
			 {
				System.out.println("i is: + " + i );
				xgradiant = coordinates[i][0] - coordinates[i + 1][0]; // [1][0] - [2][0]
				System.out.println("xgradiant is  :" + coordinates[i][0] + "- " + coordinates[i + 1][0] + "= " +  xgradiant  );
				System.out.println(coordinates[i][0] + " - " + coordinates[i + 1][0] + " = " + xgradiant);
				ygradiant = coordinates[i][1] - coordinates[i+ 1][1];  // [1][1] - [2][1]
				System.out.println(coordinates[i][1] + " - " + coordinates[i+ 1][1] + " = " + ygradiant);

				 if (xgradiant == 0.0) {
				 	countSame = countSame + 1;
					 System.out.println( "Same x coordinate count " + countSame );
				 } else {
					 double slope = (double) ygradiant / xgradiant;
					 System.out.println("New Slope is " + slope);
					 if (slope!=origslope) {
						 isStraight = false;
						 break outerloop;
					 }
				 }
			}

		}
		int counts= coordinates.length -1;

		if (countSame > 0 ) {
			if (countSame==counts) {
				System.out.println("Same x coordinate count " + countSame + "And coordinates.length -1  is " + counts);
				return true;
			} else {
				System.out.println("Same x coordinate count " + countSame + "And coordinates.length -1  is " + counts);
				return false;
			}
		}

		return isStraight;
	}
}

