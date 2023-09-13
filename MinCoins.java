package medium;

import java.lang.reflect.Array;
import java.util.Arrays;



public class MinCoins {

		static int[] dp ;

		public static void main(String[] args) {
			int[] coins = new int[]{1, 5, 7};
			System.out.println(coinChange(coins, 18));

			for (int i = 0; i < dp.length; i++) {
				System.out.println(dp[i]);
			}
		}


		public static  int  coinChange(int[] coins, int amount) {
			dp = new int[amount+1];
			Arrays.fill(dp, -1);
			dp[0] = 0;

			int ans =  coinCount(coins, amount);
			if ( ans == Integer.MAX_VALUE) {
				return -1;
			}else {
				return ans;
			}
		}

		public  static int coinCount(int[] coins, int amount) {
			if( amount==0) {
				return 0;
			}
			if(amount < 0) {
				return Integer.MAX_VALUE;
			}
			if(dp[amount] != -1) {
				return dp[amount];
			}
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < coins.length; i++) {
				int  subAns = coinCount(coins, amount - coins[i]);
				if(subAns !=Integer.MAX_VALUE ) {
					ans = Math.min(ans, 1 + subAns);
				}
			}
			return dp[amount] = ans;
		}
	}