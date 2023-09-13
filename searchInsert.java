public class searchInsert {
	public static void main(String[] args) {
      int[] nums = new int[]{1,2};
      System.out.println(searchInsert( nums, 3));
	}

	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int last = nums.length -1;

		while( start <= last) {
			int mid = start + (last - start) / 2;

				if (target==nums[mid]) {
					return mid;
				} else if (target < nums[mid]) {
					last = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
        return start;
		}

	}

