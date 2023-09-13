package medium;

public class LongestPalindromeSubstring {

public static void main(String[] args) {
	System.out.println(longestPalindrome("racecar"));
	System.out.println(longestPalindrome("babad"));
	System.out.println(longestPalindrome("cbbd"));

}

	public static String longestPalindrome(String s) {
		if (s == null || s.length() < 1) return "";
		int start = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandFromCenter(s, i, i);
			int len2 = expandFromCenter(s, i, i+1);
			int len = Math.max( len1, len2);
			//expand start and endpointerts  outwards
			if ( len > end - start) {
				start = i - ((len -1)/2);
				end = i + len/2;
			}
		}
		return s.substring(start, end +1);
	}

	public static int expandFromCenter(String s, int start, int end)  {
	       if( s == null || start > end) return 0;
			while( start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			 start = start -1;
			 end = end +1;
		}
			return end - start -1;

		}
}
