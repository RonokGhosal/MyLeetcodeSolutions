import java.awt.color.ICC_Profile;
import java.util.IllformedLocaleException;

class SolutionMergeSort {
	public static void main(String [] args) {

		int[] nums1 = new int[]{1,2,3,0,0,0};
		int[] nums2 = new int[]{4,5,6};
		int m = 3;
		int n = 3;
		merge(nums1,  m,  nums2,  n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
      m--;
      n--;
      int i = nums1.length -1 ;
      while(i >=0 ) {
      if (m < 0 ) {
      	nums1[i] = nums2[n--];
	} else if ( n < 0) {
      	nums1[i] = nums1[m--];
      } else {
      	if (nums1[m] > nums2[n]) {
      		nums1[i] = nums1[m--];

      	} else {
		        nums1[i] = nums2[n--];

        }
      }
      i --;
      }
	}
}