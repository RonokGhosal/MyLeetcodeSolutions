import com.sun.source.tree.IfTree;

import javax.security.auth.login.AccountException;

public class GCDofStrings {
	public static void main (String[] args) {
		String s1="ABABAB";
		String s2="AB";
		String output = gcdOfStrings( s1,s2);
		System.out.println(output);
	}

	public static String gcdOfStrings(String s, String t) {
      int index = s.indexOf(t);
	  String newStr = "";
      System.out.println("index is " + index);
		if (index == -1 ) return "";
     else {
			int gcf = s.length() / t.length();
			System.out.println("gcf is " + gcf);
			int count = 0;
			while (count < gcf) {
				newStr = newStr + t;
				System.out.println("newStr is " +newStr );
				count++;

			}
		}
			if( newStr.equals(s)) {
				System.out.println("finally newStr is " + newStr);
				int startindex =  s.indexOf(t) + t.length();
				int endindex = s.length();
				String ret = s.substring(startindex,endindex );
				return ret;
			} else {
				return "";
			}
     }

}
