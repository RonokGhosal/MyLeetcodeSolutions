public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower" , "flow", "z"};
		System.out.println("Longest Prix string is :" + longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		int min = 299;
		String prefix = "";
		for (String str : strs) {
			if (str.length() < min) {
				min = str.length();
				prefix = str;
			}
		}
		System.out.println("Manisha prefix is :" + prefix);
		System.out.println("Manisha min length is :" + min);
		int len = prefix.length();
		while (len > 0) {
			boolean prfixFound = true;
			outerloop:
			for (String str : strs) {
				System.out.println("Checking for prefix " + prefix + " in string" + str);
				 prfixFound = str.startsWith(prefix);
				System.out.println("Manisha prfexFound is " + String.valueOf(prfixFound));
				if (! str.startsWith(prefix)) {
					prefix = prefix.substring(0, prefix.length() - 1);
					len = prefix.length();
					break outerloop;
				}
			}
			if (prfixFound){
				return prefix;
			}
		}
		return prefix;
	}

	}

