import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
	public static void main(String[] args) {
		System.out.println("Roman value of MCMXCIV is " + romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String str) {
		int num = 0;
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		System.out.println("str.length() is "  + str.length());
		for (int i = 0; i <= str.length() - 1; i++) {
			System.out.println("i is " + i);

			int numi= romanMap.get(str.charAt(i));
			System.out.println("numi is :" + numi);
			int numnext = 0 ;
			if (i < str.length() - 1) {
				 numnext = romanMap.get(str.charAt(i + 1));
			}
			System.out.println("numnext is :" + numnext);
			if (numi < numnext) {
				num = num + (numnext - numi);
				System.out.println("num is " + num);
				i ++;
			}

			else
				num = num + numi;
			   System.out.println("num is " + num);
		}


		return num;
	}
}