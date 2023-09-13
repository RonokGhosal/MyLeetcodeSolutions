public class reverseString {
	public static void main(String[] args) {
		char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		for (char c : s) {
      System.out.print(c + " '");
		}
	}
	public static void reverseString(char[] s) {
		int start = 0;
		int end = s.length -1;
		while(end >= start) {
			char temp = s[end] ;
			s[end] = s[start];
			s[start] = temp;
			end --;
			start ++;
		}
	}
}
