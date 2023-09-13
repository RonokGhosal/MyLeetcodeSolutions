import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.zip.Checksum;

public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = new int[]{0,1,3,4,5};
		System.out.println(missingNumber(nums));
	}



	public static int missingNumber(int[] nums) {
	  int sum =0;
	 for(int i =0; i <nums.length; i ++ ) {
	 	sum = sum + nums[i];
	 }
      int expectedSum =0;
      for(int i =0; i < nums.length +1 ; i ++){
	    expectedSum = expectedSum + i;
      }
     return expectedSum - sum;
}


}
