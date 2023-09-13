import jdk.dynalink.beans.StaticClass;

import javax.swing.text.Caret;
import java.security.AlgorithmConstraints;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = new int[]{2,2,1,1,1,2,2};
		int ret =  majorityElement( nums);
		System.out.println(ret);

	}

	public static int  majorityElement(int[] nums) {
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (countMap.containsKey(nums[i])) {
				countMap.put(nums[i], countMap.get(nums[i]) + 1);
			} else {
				countMap.put(nums[i], 1);
			}
		}
		double maj = (double) nums.length / 2.0;
		int ret = -1;
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {


			if (entry.getValue() >= Math.round(maj)) {
				ret = entry.getKey();
				break;
			}
		}
		return ret;
	}

}
