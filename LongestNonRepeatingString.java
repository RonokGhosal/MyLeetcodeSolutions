package medium;

import javax.swing.text.Caret;
import java.util.*;

public class LongestNonRepeatingString {
	public  static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public  static int lengthOfLongestSubstring(String s) {
       int i = 0;
       int j = 0;
       int max = 0;

		HashSet<Character> hashSet = new HashSet<>();
        while(j <s.length()) {
	        if (!hashSet.contains(s.charAt(j))) {
		        hashSet.add(s.charAt(j));
		        System.out.println(hashSet);
		        max = Math.max(max, hashSet.size());
		        j++;

	        } else {
		        hashSet.remove(s.charAt(i));
		        i++;
	        }
        }
	        return max;
        }

}
