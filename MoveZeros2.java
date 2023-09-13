public class MoveZeros2 {

	public static void main(String[] args) {
		int[] nums = new int[]{4,2,4,0,0,3,0,5,1,0};
		moveZeros(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void moveZeros(int[] nums) {
		int left = 0;
		int right = 1;
		while( right<=nums.length -1 ) {
			if (nums[left] == 0 && nums[right] !=0 ) {
				int tmp = nums[left];
				nums[left] = nums[right];
				nums[right] = tmp;
				left ++;
				right++;

			}   else if (nums[left] != 0 && nums[right] ==0) {
				left ++;
				right++;
			} else if (nums[left] != 0 && nums[right] !=0) {
				left ++;
				right++;
			}
			else {
				right++;
			}
		}
	}
}
