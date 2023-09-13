public class NeitherMaxNorMin {
	public static void main(String[] args) {
		int[] nums = new int[]{2,1,3};
		System.out.println(findNonMinOrMax(nums));
	}

	public static int  findNonMinOrMax(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int neither = -1;
		if (nums.length <=2) {
			return -1;
		} else {
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] < min) {
					neither = min;
					System.out.println("neither is " + neither);
					min = nums[i];

				} else if (nums[i] > max) {
					neither = max;
					System.out.println("neither is " + neither);
					max = nums[i];
				} else {
					return nums[i];
				}
			}
		}
		System.out.println("neither is " + neither);
		return neither;
	}
}
