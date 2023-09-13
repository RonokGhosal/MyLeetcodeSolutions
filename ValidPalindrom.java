import javax.security.auth.login.AccountException;

public class ValidPalindrom {
	public static void main(String[] args) {
		boolean ret = isPalindrome("A man, a plan, a canal -- Panama");
		String retStr = (ret == true) ? " Ronok True" : "Ronok False";
		System.out.println(retStr);

	}

	public static boolean isPalindrome(String s) {
		int count  = 0;
		String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
		System.out.println("modified string is " + str);

		int halfstrlength = str.length()/2;

	 while ( count <=  halfstrlength ) {

		 if (str.charAt(count) != str.charAt(str.length() -1  - count)) {
	 		return false;
		 }
		 count ++;
		 halfstrlength = str.length()/2;

	 }
	 return true;
	}
}
