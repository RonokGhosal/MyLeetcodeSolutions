import java.util.zip.Checksum;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(45));
	}

	public static int climbStairs(int n) {
          if (n ==1   ) {
          	return 1;
      }
        int dp[] = new int[n+1];
          dp[1] = 1;
          dp[2] = 2;
          int sum = 0;
          for ( int i= 3; i <= n; i ++ ) {
          	dp [i ] = dp[i-1] + dp [i -2];

          }
            	return dp[n];

	}

}
