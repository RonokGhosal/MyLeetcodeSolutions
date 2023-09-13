package medium;

import com.jogamp.nativewindow.WindowClosingProtocol;
import jdk.jfr.SettingControl;

import javax.naming.ldap.BasicControl;

public class ZeroMatrix {
	static boolean firColIsZero = false;
	static boolean firstRowIsZero = false;
	public static void main(String[] args) {

		int[][] matrixzero = new int[3][4];
		matrixzero[0][0] = 0;
		matrixzero[0][1] = 1;
		matrixzero[0][2] = 2;
		matrixzero[0][3] = 0;

		matrixzero[1][0] = 3;
		matrixzero[1][1] = 4;
		matrixzero[1][2] = 3;
		matrixzero[1][3] = 6;

		matrixzero[2][0] = 1;
		matrixzero[2][1] = 5;
		matrixzero[2][2] = 1;
		matrixzero[2][3] = 0;
        System.out.println("initial matrix" );
		printMatrix(matrixzero , 4, 3);
		zeroMatrix(matrixzero);
		for ( int r = 0; r <matrixzero.length; r ++) {
			for ( int c = 0; c < matrixzero[0].length; c++) {
			//	System.out.println(matrixzero[r][c]);
			}
		}
	}

	public static void zeroMatrix(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;

		for (int r = 0; r < row; r++) {
			if (mat[r][0]==0) {
				firColIsZero = true;
				break;
			}
		}
		for (int c = 0; c < col; c++) {
			if (mat[0][c]==0) {
				firstRowIsZero = true;
				break;
			}
		}
		System.out.println("firstRowIsZero is " + firstRowIsZero +  " firColIsZero is " + firColIsZero);
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				if (mat[r][c]==0) {
					System.out.println("Found 0 in row " + r + " column " + c);
						mat[0][c] = 0;
						mat[r][0] = 0;
					}
				}
			}
			System.out.println("setting first col and first row of zero found");
			printMatrix(mat, col, row);

		for (int c = 1; c < col; c++) {
			if (mat[0][c]==0) {
				nullifyCol(mat, row, c);

			}
		}
		System.out.println("After nullify column");
		printMatrix(mat, col, row);

		for (int r = 1; r < row; r++) {
			if (mat[r][0]==0 )  {
				System.out.println(" calling nullifyRow on row " + r  );
				nullifyRow(mat, col, r);

			}

		}
			System.out.println("After nullify row");
			printMatrix(mat, col, row);


		System.out.println("After nullify row");
		printMatrix(mat, col, row);


		if (firColIsZero==true) {
			for (int r = 0; r < row; r++) {
				mat[r][0] = 0;
			}
		}
		System.out.println("After firColIsZero found true ");
		printMatrix(mat, col, row);

		if (firstRowIsZero) {
			for (int c = 0; c < col; c++) {
				mat[0][c] = 0;
			}
		}
		System.out.println("After firstRowIsZero found true ");
		printMatrix( mat ,  col,  row);
	}
	//firstrow had 0 nullify
	//first col had null, nullify


		public static void nullifyCol(int[][] mat , int row, int c){
			for (int r = 1; r < row; r++) {
					mat[r][c] = 0;
				}
			}

	public static void nullifyRow(int[][] mat , int col, int r){
			for (int c = 1; c < col; c++) {
				System.out.println("Setting  to zeros colum " +  c  + " row  " + r );
				if (mat[r][c] != Integer.MIN_VALUE) {
					mat[r][c] = 0;
				}

			}
		}
	public static void printMatrix(int[][] mat , int col, int row) {
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
	}

}
