import java.util.Arrays;

public class GoodArray {
 public static void main(String args[]) {
 	int[] nums = new int[]{1,3,3,2};
 	System.out.println(isGood(nums));
 }


	public static boolean isGood(int[] nums) {
		int n  = nums.length-1;
		Arrays.sort(nums);
		for(int i = 0; i < n; i ++) {
			int val  = i + 1;
			if (nums[i] != val) {
				System.out.println(nums[i]);
				System.out.println(i + 1);
				return false;
			}
		}
			if (nums[n ] != nums.length -1  ) {
				System.out.println(nums[n]);
				System.out.println(nums.length );
				return false;
			}

		return true;
	}
}
