public class BinarySearch {
	public static void main(String args[]) {
			int[] nums = new int[]{-1,0,3,5,9,12};
		int ret = search(nums,0);
		System.out.println("target 0 found in index " + ret);
	}

	public static int search(int[] nums, int target) {
	     int start = 0;
	     int end = nums.length -1;

	    while(start <=end) {
		    System.out.println("start is :" + start);
		    System.out.println("end is :" + end);
		    int mid = start + (end -start) /2;
			    if (target==nums[mid]) {
				    return mid;
			    } else if (target > nums[mid]) {
				    start = mid + 1;
			    } else {
				    end = mid - 1;
			    }

	    }
	    return -1;
	}
}
