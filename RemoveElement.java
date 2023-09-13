
import java.util.Arrays;


public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = new int[]{0,1,2,2,3,0,4,2};
		int val = 2;
		int ret = removeElement(nums, val);
		System.out.println("k is " + ret);
		int ret2 =removeElementSmartly(nums,val);
		System.out.println("k is  " + ret2);
	}

	public static int removeElement(int[] nums, int val) {
		int k = 0;
		int[] expectedNums = new int[nums.length];
		int l = nums.length - 1;
		int s = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i]==val) {
				expectedNums[l--] = nums[i];

				k++;
			} else {
				expectedNums[s++] = nums[i];
			}
		}
		//Arrays.sort(expectedNums, 0, k-1);

		for (int ii = 0; ii < nums.length; ii++) {
			nums[ii] = expectedNums[ii];
			//System.out.print(nums[ii] + " ");
		}
		return nums.length - k;

	}

	public static int removeElementSmartly(int[] a, int val) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=val) {
				a[k] = a[i];
				k = k + 1;
			}
		}
			return k;
	}
}