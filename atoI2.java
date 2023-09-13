package medium;

import javax.swing.text.html.HTMLDocument;
import java.beans.DesignMode;
import java.util.IllformedLocaleException;

public class atoI2 {
	public static void main(String[] args) {
		//Integer.MAX_VALUE = 2147483647
		//Integer.MIN_VALUE =-2147483648
		System.out.println(myAtoi("1010023630o4"));
	}

	public static int myAtoi(String s) {

	int result = 0;
	int sign = 1;
	boolean started = false;
	String sTrimmed = s.trim();
	if( sTrimmed.equals("") ||sTrimmed == null ) {
		return 0;
	}
	if (sTrimmed.length() == 1 && !Character.isDigit(sTrimmed.charAt(0))){
		return 0;
	}
	if (sTrimmed.charAt(0) == '-')  {
		sign = -1;
	}



		int index=0;
		if (sTrimmed.charAt(0) == '+' || sTrimmed.charAt(0) == '-') {
			index =1;
		}


		if ((sTrimmed.charAt(index) - '0') < 0  || ((sTrimmed.charAt(index) - '0') > 9)) {
	return 0;
		}

		for (int i = index; i < sTrimmed.length(); i ++) {

			if ( (sTrimmed.charAt(i) -'0') >= 0 && (sTrimmed.charAt(i) -'0') <= 9 ||sTrimmed.charAt(i) =='.' ) {
			started = true;
			} else {
				break;
			}
             if ( sTrimmed.charAt(i) =='.') {
             	return result;
             }

				result =   (result *10) + (sTrimmed.charAt(i)-'0')* sign;
				System.out.println("result : " + result);
				System.out.println("(c -'0') is "  + (sTrimmed.charAt(i) -'0') );
			    System.out.println("i is " + i );
			System.out.println("sTrimmed.length() -1  is " + (sTrimmed.length() -1 ) );
				if (result  > Integer.MAX_VALUE/10 && i != (sTrimmed.length() -1) && Character.isDigit(sTrimmed.charAt(i+1)) ) {
					System.out.println(result +" > " + Integer.MAX_VALUE/10);
					return sign * Integer.MAX_VALUE;
				}
				if (result == Integer.MAX_VALUE/10 && sign * (sTrimmed.charAt(i+1) -'0') > 7  ) {
					System.out.println(result +" == " + Integer.MAX_VALUE/10 + " and (c -'0') > 7 ");
					return sign * Integer.MAX_VALUE;
				}
				System.out.println("result   is " + result  );
				if (result  < Integer.MIN_VALUE/10  && i != sTrimmed.length() -1 && Character.isDigit(sTrimmed.charAt(i+1)) ) {
					System.out.println( sign * result +" < " + Integer.MIN_VALUE/10);
					return Integer.MIN_VALUE;
				}
				if ( result  == Integer.MIN_VALUE/10 && sign * (sTrimmed.charAt(i+1) -'0') < -8) {
					System.out.println(sign * result /10 +" == " + Integer.MIN_VALUE/10 + "and c -'0' is " + sign * (sTrimmed.charAt(i) -'0') ) ;
					return sign * Integer.MIN_VALUE;
				}

			}



if(!started) {
	return 0;
}

		return result;
	}

}
