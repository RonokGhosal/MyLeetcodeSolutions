import java.math.BigInteger;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Checksum;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = new int[]{9,9,9};
		int[] newlist = plusOne(digits);
		for (int i : newlist) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1 ; i >= 0; i --) {
			if ( digits[i] < 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] newdigits = new int[digits.length +1] ;
		newdigits[0] = 1;
		return newdigits;

	}
}
