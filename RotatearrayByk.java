package medium;

public class RotatearrayByk {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		rotate( nums, 3);
		for(int i =0; i< nums.length; i ++) {
			System.out.println(nums[i]);
	}
	}
	public static void rotate(int[] nums, int k) {

		reverse(nums, 0, nums.length -1);
		 reverse(nums, k, nums.length -1);
		 reverse(nums, 0,k-1);

	}

	public static void reverse(int[] nums, int s, int l) {

		while ( l > s) {

			int temp = nums[s] ;
			nums[s]= nums[l];
			nums[l] = temp;
			l--;
			s++;
		}

	}

}
