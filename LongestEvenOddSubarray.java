import javax.lang.model.type.IntersectionType;
import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestEvenOddSubarray {
	public static void main(String args[]) {
		int[] nums = new int[]{3,2,5,4};

		System.out.println(longestAlternatingSubarray(nums, 5));
	}

	public static int longestAlternatingSubarray(int[] nums, int threshold) {
		int res  = 1;
		int count = 1;
		boolean foundeven = false;
		if (nums.length == 0 ) {
			return 0;
		}
		if ( (nums.length ==1  && nums[0] <= threshold && nums[0] %2 == 0 )) {
			return 1;
		}
		if ( (nums.length == 1  && nums[0] > threshold && nums[0] %2 == 0 )) {
			return 0;
		}
		if ( (nums.length ==1  && nums[0] %2 != 0 )) {
			return 0;
		}

		for (int i = 0; i < nums.length; i++) {

			if ( nums[i] % 2 == 0 &&  nums[i] <= threshold) {
				foundeven = true;
				int j = i+1;
				while(j < nums.length ) {
					if (nums[j] <= threshold && (nums[j] %2 !=nums[j-1] %2)) {
						count++;
					}
					else {
						break;

					}
					j = j+1;
				}
				res = Math.max(res, count);
				count = 1;
			}
		}
		if (foundeven == false ) {
			return 0 ;
		} else {

			return res;

		}
	}
}



