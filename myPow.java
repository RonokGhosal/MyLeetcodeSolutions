package medium;

import javax.swing.*;
import java.util.logging.XMLFormatter;

public class myPow {
	public static void main(String args[]) {
		System.out.println(myPow(1.00000, -2147483648));

	}


	public static double myPow(double x, int n) {
		long pow = (long)n;
		double res = pow(x,pow);
	    return (n <0) ? 1.0/res : res;
	}

	public static double pow(double x, long n) {
		if (n == 0) return 1;
		if (x == 0) return 0;
		double result = pow(x, n/2);
		result *= result;
		if (n%2 == 1) {
			result = x * result;
		}
     return result;

	}
}