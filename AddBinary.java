import com.jogamp.nativewindow.GenericUpstreamSurfacelessHook;
import com.sun.nio.sctp.IllegalUnbindException;

import javax.print.DocFlavor;
import java.util.IllegalFormatCodePointException;
import java.util.zip.Checksum;

public class AddBinary {
	public static void main(String[] args) {

		//System.out.println(addBinary("1", "11"));
		char cOne = 'A';
		int iOne = 120;
		double dOne = 60.5;
		char var = 'H';
		iOne = cOne+3;
		System.out.println(iOne); // LINE 1
		iOne=iOne/2;
		System.out.println(iOne); //LINE 2
		dOne=dOne-10;
		System.out.println(dOne); // LINE 3
		iOne=cOne+5;
		System.out.println(iOne); // LINE 4
		dOne=dOne/2;
		System.out.println(dOne); // LINE 5
		iOne-=25;
		System.out.println(iOne); // LINE 6
		dOne=dOne/2;
		System.out.println(dOne); // LINE 7
		iOne+=35;
		System.out.println(iOne); // LINE 8
		iOne++;
		System.out.println(iOne); // LINE 9
		System.out.println(7%9); // LINE 10
		System.out.println(10+9/2); // LINE 11
		System.out.println(19%3); // LINE 12
	}

	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int carry = 0;
		int i = a.length() -1;
		int j = b.length() -1;

		while (i >=0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += a.charAt(i) - '0';
			}
			if (j >= 0) {
				sum += b.charAt(j) - '0';
			}
			result.append(sum % 2);
			carry = sum / 2;
			i--;
			j--;
		}

        if (carry > 0) {
        	result.append(carry);
        }
		return (result.reverse().toString());
	}
}
