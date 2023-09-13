package medium;

import javax.security.auth.login.AccountException;

public class JumpGame2 {

	public static void main(String[] args) {
		int [] nums = new int[] {2,3,0,1,4};
		System.out.println(jump(nums));
}

	public static  int jump( int[] nums) {
			int jumps =0;
			int curEnd = 0;
			int reachable = 0;

			for(int i =0 ; i< nums.length -1; i ++) {
				reachable = Math.max(reachable, nums[i] +i);
				if( i == curEnd) {
					jumps ++;
					curEnd = reachable;
				}
			}
			return jumps;

		}

	}