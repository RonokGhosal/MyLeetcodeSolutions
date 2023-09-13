import java.sql.SQLIntegrityConstraintViolationException;

public class MergeSorted3 {
	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[]{4, 5, 6};
		int m = 3;
		int n = 3;
		int[] ma = mergeSorted(nums1, m, nums2, n);
		for (int i = 0; i < ma.length; i++) {
			System.out.print(ma[i] + " , ");
		}
	}

	public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n) {

		int first = m - 1;
		int sec = n - 1;
		int last = m + n - 1;
		while (sec >= 0 && first >=0) {
			if (nums2[sec] > nums1[first]) {
				nums1[last] = nums2[sec];

				last = last - 1;
				sec = sec - 1;
			} else {
				nums1[last] = nums1[first];
				last = last - 1;
				first = first - 1;
			}

		}
		return nums1;
	}
}
