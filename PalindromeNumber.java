import javax.swing.*;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println( isPalindrome(141));
		System.out.println(isPalindrome(145));
	}

	public static boolean isPalindrome(int x) {
		//145
		int orig = x;
		int revNum = 0;
		while (x > 0) {
			int mod = x % 10;
			revNum = revNum * 10 + mod;
			x = x / 10;
		}
		return((( revNum == orig ) ? true : false));


	}
}
