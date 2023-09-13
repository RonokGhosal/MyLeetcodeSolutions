import javax.security.auth.login.AccountException;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
       if(s.length() < t.length()){
       	return false;
       }
		StringBuilder sb = new StringBuilder(s);
		StringBuilder tb = new StringBuilder(t);
		Map<Character, Integer> myMap = new HashMap<>();

		boolean found = false;
		int count = 1;
		for (int i = 0; i < sb.length(); i++) {
			if (myMap.containsKey(sb.charAt(i))) {
				System.out.println("Adding in S " + sb.charAt(i));
				myMap.put(sb.charAt(i), myMap.get(sb.charAt(i)) + 1);
				System.out.println(sb.charAt(i) + ":" + myMap.get(sb.charAt(i)));
			} else {
				System.out.println("Adding in S " + sb.charAt(i));
				myMap.put(sb.charAt(i), 1);
				System.out.println(sb.charAt(i) + ":" + myMap.get(sb.charAt(i)));
			}
		}
		for (int i = 0; i < tb.length(); i++) {
			if (myMap.containsKey(tb.charAt(i))) {
				System.out.println("Subtrating in T " + sb.charAt(i));
				myMap.put(tb.charAt(i), myMap.get(tb.charAt(i)) - 1);
				System.out.println(tb.charAt(i) + ":" + myMap.get(tb.charAt(i)));
			} else {
				System.out.println("Adding in T " + tb.charAt(i));
				myMap.put(tb.charAt(i), 1);
				System.out.println(tb.charAt(i) + ":" + myMap.get(tb.charAt(i)));
			}
		}


		for ( int i: myMap.values() ) {
			System.out.println( i);
			if ( i!= 0) {
				return false;
			}
		}
		return true;

	}


}
