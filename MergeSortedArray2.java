public class MergeSortedArray2 {

	public static void main(String [] args) {
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		int m = 3;
		int n = 3;
		int[] ma = mergeSorted(nums1, m, nums2, n);
		for (int i =0; i <ma.length; i++ ) {
			System.out.print(ma[i] +  " , ");
		}
	}

	public static int[]  mergeSorted(int[] nums1, int m, int[] nums2, int n) {

		int i = m+n-1 ; // end of nums1
		int j = m-1;
		int k = n-1;
		while( ! (i < 0 )) {
			if (nums2[k] > nums1[j]) {
				nums1[i] = nums2[k];

				System.out.println("i: nums1[" +i + "] is: " + nums1[i]);
				System.out.println("j : nums1[" +j + "] is: " + nums1[j]);
				System.out.println("k : nums2["+ k + "] is: " + nums2[k]);

				k--;
				i--;
				if (k < 0) {
					return nums1 ;
				}
			} else if (nums2[k] <  nums1[j])
			{
				nums1[i] = nums1[j];
				System.out.println("i: nums1[" +i + "] is: " + nums1[i]);
				System.out.println("j : nums1[" +j + "] is: " + nums1[j]);
				System.out.println("k : nums2["+ k + "] is: " + nums2[k]);
				nums1[j] = 0;
				//j--;
				i--;
				if (j < 0 ) {
					j = 0;
				}

			} else if (nums2[k] == nums1[j]) {
				System.out.println("i: nums1[" +i + "] is: " + nums1[i]);
				System.out.println("j : nums1[" +j + "] is: " + nums1[j]);
				System.out.println("k : nums2["+ k + "] is: " + nums2[k]);
				nums1[i] = nums1[j];
				nums1[j] = 0;
				System.out.println("i: num1[" + i +"] is: " + nums1[i]);
				System.out.println("j : num1[" + j +"] is: " + nums1[j]);
				System.out.println("k num2[" + k +"] is: " + nums2[k]);
				i--;
			//	j--;
				if (j < 0 ) {
					j = 0;
				}
				System.out.println("After 2 =2 found ad inserted ");;
				System.out.println("i: num1[" + i +"] is: " + nums1[i]);
				System.out.println("j: num1[" + j +"] is: " + nums1[j]);
				System.out.println("k: nums2[" + k +"] is: " + nums2[k]);
			}
		}
		return nums1;
	}

}
