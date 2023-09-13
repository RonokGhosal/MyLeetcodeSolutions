package medium;

public class RemoveDuplicatesFromSorttedAtrray2 {

	public static void main(String[] args) {
		int nums[] = {1,1,2,2,3,3,3};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
        if ( nums.length <3 ) {
        	return nums.length;

        }
		int s = 2;
		int f= 2;
		while ( f < nums.length)  {
			if ( nums[f]!=nums[s-2])
				nums[s++] =nums[f];
			f++;


		}
		 return s;
	}
}
