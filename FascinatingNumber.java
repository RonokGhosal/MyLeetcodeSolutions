import javax.security.auth.login.AccountException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FascinatingNumber {
	public static void main(String[] args) {
		System.out.println(isFascinating(267));
	}

	public static boolean isFascinating(int n) {

		int n1 = n * 1;
		int n2 = n * 2;
		int n3 = n * 3;
		String connumber = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3);
		int count = 0;
		if (connumber.length()!=9) {
			return false;
		}
		Map<Character, Integer> myMap = new HashMap<>();
		while (count < connumber.length()) {
			if (myMap.containsKey(connumber.charAt(count))) {
				myMap.put(connumber.charAt(count), myMap.get(connumber.charAt(count)) + 1);
			} else {
				myMap.put(connumber.charAt(count), 1);
			}
			count++;
		}
		for (Map.Entry<Character, Integer> myEntry : myMap.entrySet()) {
			Character key = myEntry.getKey();
			Integer value = myEntry.getValue();

			if (key == '0' || value != 1) {
				return false;
			}

		}
		return true;

	}
}


