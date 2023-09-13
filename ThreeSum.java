package medium;

import java.util.*;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = new int[]{3,0,-2,-1,1,2};
		List<List<Integer>> threeSum = threeSum(nums);
		for (int i = 0; i < threeSum.size(); i++) {
			List listnums = threeSum.get(i);
			for (int j = 0; j < listnums.size(); j++) {
				System.out.print(listnums.get(j) + " ");
			}
			System.out.println();
		}

	}


	public static List<List<Integer>> threeSum(int[] nums) {

		Set<List<Integer>> set = new HashSet<>();
		boolean notZero = true;
		for ( int i =0 ; i < nums.length; i ++ ) {
			if (nums[i] != 0 ) {
				notZero = false;
				break;
			}
		}
		if (notZero) {
			List<List<Integer>> litsOfThreeSome = new ArrayList<>();
			litsOfThreeSome.add(Arrays.asList(0,0,0));
			return litsOfThreeSome;
		}
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				List<Integer> threesome = new ArrayList<>();
				int sum = nums[i] + nums[left] + nums[right];
				if (sum==0) {
					 threesome.add(nums[left]);
					threesome.add(nums[i]);
					threesome.add(nums[right]);
					Collections.sort(threesome);
					set.add(threesome);
					left++;
			      // while(nums[left] == nums[left -1] && left < right) {
			       //	left++;
			      // }
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}

		}
		List<List<Integer>> litsOfThreeSome = new ArrayList<>(set);
			return litsOfThreeSome;

	}
}
