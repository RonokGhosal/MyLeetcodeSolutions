import javax.security.auth.login.AccountException;

public class InSubsequence {

	public static void main(String[] args) {
		String s = "axc";
		String t = "ahbgdc";
		boolean ret = isSubsequence(s, t);
		System.out.println("ret is " + ret);
	}

	public static boolean isSubsequence(String s, String t) {
		int start = 0;
		int end = t.length() - 1;
		boolean found = false;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char srch = s.charAt(i);
			System.out.println( "Searching for char:" + srch);
			System.out.println("start index is " + start);
			System.out.println("end index is " + end);
			while (start <= end) {
				if (t.charAt(start)==srch) {

					System.out.println( "Found char "+  srch + " At index " + start) ;
					start = start + 1;
					count++;
					System.out.println( "count is " + count) ;
					break;
				} else {
					start++;
				}
			}
		}

		return count==s.length();
	}
}
