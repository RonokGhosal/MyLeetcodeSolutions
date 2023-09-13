package medium;

import javax.security.auth.login.AccountException;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.zip.Checksum;

public class atoI {
	public static void main(String[] args) {
		//Integer.MAX_VALUE = 2147483647
		//Integer.MIN_VALUE =-2147483648
		System.out.println(myAtoi("-41"));
	}

	public static int myAtoi(String s) {
		Boolean isNegative = false;
		if (s==null || s.length()==0) {
			return 0;
		}
		int num = 0;
		String mystr = s.trim();
		if (mystr.charAt(0)=='-') {
			isNegative = true;
		}
		int index = 0;
		if (mystr.charAt(0)=='+' || (mystr.charAt(0)=='-')) {
			index = 1;
		}

		int sum = 0;
		int startIdx = index;
		int start =0;
		int end =0;

		if(Character.isDigit(mystr.charAt(index)) ) {

		while (index < mystr.length() && Character.isDigit(mystr.charAt(index)) ) {

			index++;
		}
		start = 0;
		end = index;
		System.out.println("Startindex is now " + start);
		System.out.println("End is now " + end);

		}
		else {
			while (index < mystr.length() && !Character.isDigit(mystr.charAt(index)) ) {

				index++;
			}
			start = index;
			end =  mystr.length();
			System.out.println("index is now " + index);
		}

		String  numStr = mystr.substring(start,end );
		System.out.println("Extracted numeric string is " + numStr);
	/*	if (index < 1) {
			 numStr = mystr.substring(startIdx,mystr.length() );

		System.out.println("Extracted numeric string is " + numStr);
	} else {
			System.out.println("start index is : " + startIdx);
			System.out.println("end index is : " + index);
			 numStr = mystr.substring(startIdx, index );


			System.out.println("Extracted numeric string is " + numStr);
		}*/

		sum = 0;
		for (int i = 0; i < numStr.length(); i++) {

			int x = numStr.charAt(i) - '0';
			if (isNegative) {
				sum = sum * 10 - x;
			} else {
				sum = sum * 10 + x;
			}
			int b4lastIndex = numStr.length() - 2;
			if (i == b4lastIndex) {
				if (sum > Integer.MAX_VALUE / 10 || sum==Integer.MAX_VALUE / 10 && (numStr.charAt(numStr.length() -1) - '0') > 7) {
					return Integer.MAX_VALUE;
				}

				if (sum < Integer.MIN_VALUE / 10 || sum==Integer.MIN_VALUE / 10 && (numStr.charAt(numStr.length() -1) - '0') > 8 ) {
					return Integer.MIN_VALUE;
				}
			}
		}
        return sum;
	}
}

