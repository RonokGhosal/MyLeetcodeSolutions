public class MergeSortedArray {

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


		int i = m + n-1 ; // end of nums1
		int j = m-1;
		int k = n-1;

		outerloop:
		while( ! (i < 0 )) {
			if ( nums1.length == 0 && nums2.length == 0 ){
				break outerloop;
			}
			else if ( nums1.length == 0 && nums2.length != 0 )
			{
				nums1 = nums2;
				break outerloop;
			}
			else if ( nums2.length == 0 && nums2.length != 0 )
			{

				break outerloop;
			}
			else if( nums2.length != 0  && nums2.length != 0 ) {

				if (nums2[k] > nums1[j]) {
					nums1[i] = nums2[k];
					k--;
					i--;
					if(k<0) {
						return nums1;
						//break outerloop;
					}
				} else if (nums2[k] <  nums1[j])
				{
					nums1[i] = nums1[j];

					nums1[j] = 0;
					j--;
					i--;
					if (j < 0 ) {
						j = 0;
					}

				} else if (nums2[k] == nums1[j]) {
					nums1[i] = nums1[j];
					nums1[j] = 0;

					i--;
					j--;
					if (j < 0 ) {
						j = 0;
					}

				}
			}
		}
		return nums1;
	}
}

