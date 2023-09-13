import java.security.cert.CertPathBuilderResult;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		List<List<Integer>> triangle = generatePascalTriangle(5);
		for ( List<Integer> row : triangle) {
			for (Integer i: row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public static List<List<Integer>> generatePascalTriangle(int numRows) {
		if ( numRows == 0) {
			return null;
		}
		List<List<Integer>> triangle = new ArrayList<>();

		for ( int i = 0 ; i < numRows; i++ ) {
			List<Integer> rowIndex = new ArrayList<>();
			for ( int j = 0; j <=i; j++) {

				if (j == 0 || j == i ) {
					rowIndex.add(1);
				} else {
					rowIndex.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
				}
			}
			printRow(rowIndex, i);
			triangle.add(rowIndex);

		}
		return triangle;
	}

	public static void printRow(List row, int index) {
		for(int i = 0; i< row.size(); i ++){
			System.out.print( row.get(i) +  " ");
		}
		System.out.println("end of Row " + index);
	}
}
