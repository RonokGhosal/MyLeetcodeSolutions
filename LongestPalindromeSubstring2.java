package medium;

public class LongestPalindromeSubstring2 {

	public static void main(String[] args) {
		String s ="abaab"; //s =1, e =4
System.out.println(longestPalindrome(s));
	}
	public static String longestPalindrome(String s) {
		if ( s==null || s.length() == 0) {
			return null;
		}
		int start = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = fromCenter(s, i, i);
			System.out.println("len1 is " + len1);
			int len2 = fromCenter(s, i, i + 1);
			System.out.println("len2 is " + len2);
			int len = Math.max(len1, len2);
			if (len > end - start + 1) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}

		}
		return (s.substring(start, end +1));

	}
	public static int fromCenter(String s, int low, int high) {
		System.out.println( "Passed low " + low);
		System.out.println( "Passed high " + high);
		if ( s == null ||   low > high) {
			return 0;
	   }
		while( low >=0 &&  high< s.length() && s.charAt(low) == s.charAt(high)) {
			low = low -1;
			high = high +1;
			System.out.println( " low aftermoving" + low);
			System.out.println( " high aftermoving " + high);

		}

       return high - low  -1;

	}
}



