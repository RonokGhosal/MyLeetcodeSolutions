public class DuplicatsInArray {
    public  static void main(String[] args) {
    	int[] nums = new int[] {1,1,2};
     System.out.println("k is : " + removeDuplicates(nums) );
	    System.out.println(" original nums lenght "   + nums.length);
     }

	public static int removeDuplicates(int[] nums) {
    	int len = nums.length;
    	int k = 0;
         int[] expectedNums = new int[len];

         for ( int i = 0; i < len ; i++)  {
	         if ( i == len -1) {
		         expectedNums[k++] = nums[i];
	         }
         	else if (nums[i] != nums[i+1]) {
		         expectedNums[k++] = nums[i];

	         } else {
		         expectedNums[len  -1 ] = nums[i];
            }

         }
         for ( int i = 0 ;i < k ;i++  ) {
         	System.out.print(expectedNums[i] + ", ");
         }

		assert k == expectedNums.length;
		for (int i = 0; i < k  ; i++) {
			assert nums[i] == expectedNums[i];
		}
         return k ;
	}
}
