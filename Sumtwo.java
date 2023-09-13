public class Sumtwo {
	public static void main(String[] args) throws Exception {
		int[] nums = new int[]{3,2,4};
		int[] arr = twoSum(nums , 7);
		System.out.println("Manisha " + arr[0]);
		System.out.println("Manisha " + arr[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length  ; i ++ ) { ;
			for (int j = i+1; j < nums.length ; j++ ) {
				if (nums[i] + nums[j] == target){
					return new int[] {i, j} ;
				}

			}

		}
		return new int[0];
	}
}
