import javax.swing.text.html.HTMLDocument;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String args[]) {
		int [] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		int k = removeDuplicates(nums);
		System.out.println("Array Size after removing duplicates is " + k );

		for (int i =0; i<k; i ++ ) {
			System.out.println(nums[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {
		int k = 1;
		for (int i = 0; i < nums.length -1; i ++) {
			if ( nums[i] != nums[i+1] ) {
				nums[k++] = nums[i+1];
			}
		}
		return k;
	}
}
