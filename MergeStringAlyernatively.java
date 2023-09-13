

public class MergeStringAlyernatively {
	public static void main(String[] args) {
		String word1 = "ruby";
		String word2 = "manisha";
		System.out.println(mergeAlternately( word1,  word2));

}

	public static String mergeAlternately(String word1, String word2) {
		int strptr1 = 0;
		int strptr2 = 0;
		StringBuilder newString = null;
		int len = word1.length() - word2.length();
		int diff = len;
		if (len > 0) {
			len = word2.length();
			newString = new StringBuilder(word2+ word1);
		} else {
			len = word1.length();
			newString = new StringBuilder(word1+ word2);
		}

		int count = 0;
		int explen = 2 *len;

		while (count < explen  ) {
			newString.setCharAt(count, word1.charAt(strptr1));
			newString.setCharAt(count + 1, word2.charAt(strptr2));
			strptr1++;
			strptr2++;
			count = count + 2;
		}

		return newString.toString();
	}

   }
