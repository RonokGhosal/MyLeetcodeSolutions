import com.jogamp.nativewindow.GenericUpstreamSurfacelessHook;

import javax.naming.PartialResultException;

public class reverseVowels {

	public static void main(String[] args) {
		String s = "leetecode";
		String rev = reverseVowels(s);
		System.out.println(rev);
	}

	public static String reverseVowels(String s) {
		StringBuilder sb = new StringBuilder(s);
		int start = 0;
		int end = s.length() - 1;
		String vowels="aeiouAEIOU";
		while (start < end ) {
			while (start < end && vowels.indexOf(sb.charAt(start))==-1) {
				start++;
		}

		    while (start < end && vowels.indexOf(sb.charAt(end))== -1) {
			    end -- ;
        	}
				char tmp = sb.charAt(start);
				sb.setCharAt(start, sb.charAt(end));
				sb.setCharAt(end, tmp);
				start++;
				end--;

		}

		return sb.toString();

	}
}


