import java.util.List;

public class AddIntegerAtEnd {

	public static void main( String args[]) {
		int[] nums = new int[] { 1,2,3,4,3,5};
		int[] numsret = getDupsAtEnd( nums,  3);
		for (int i = 0; i < numsret.length; i ++) {
			System.out.println(numsret[i]);
		}

	}

	public static int[]  getDupsAtEnd(int[] nums, int target) {
		int i = 0;
		 int swapidx = 0;
		while (i < nums.length - 1) {
			if (i != nums.length - 1) {
				 swapidx = i + 1;
		   }
			if (nums[i]==target) {
				if (nums[i + 1]==target) {
					if (i != nums.length - 2) {
						swapidx = i + 2;
					}
				}

				int tmp = nums[i];
				nums[i] = nums[swapidx];
				nums[swapidx] = tmp;
			}
		i = i + 1;
	}
 return nums;

	}
}
