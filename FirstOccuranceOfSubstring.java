public class FirstOccuranceOfSubstring {
	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle ="leeto";
		int ret = strStr( haystack,  needle);
		System.out.println(ret);

	}
	public static int   strStr(String haystack, String needle) {
     return haystack.indexOf(needle);
	}
}
