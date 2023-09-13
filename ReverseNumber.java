public class ReverseNumber {
	public static  void main(String[] args) {
		System.out.println(reverse(563847412));
	}



	public static int reverse(int x) {
		int sum = 0;
		int mod = 0;
		int num = x;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		while (x!=0 )  {
			mod = x % 10; // mod = 3
			System.out.println("mod is " + mod);
			sum = sum * 10 + mod;
			System.out.println("sum is " + sum + "*10 +" + mod + " " + sum);

			 if (sum > Integer.MAX_VALUE / 10 && x > 10) {
				System.out.println("Is " + sum + ">" + Integer.MAX_VALUE / 10);
				System.out.println("Yes");
				 System.out.println("Is x > 10) " + x);
				 System.out.println("Yes");
				 return 0;
			} else if (sum==Integer.MAX_VALUE / 10 && x / 10 > 7) {
				return 0;
			} else if (sum < Integer.MIN_VALUE / 10 && x/10 <0 && x/10  >-10) {
				System.out.println("Is " + sum + "<" + Integer.MIN_VALUE / 10 + "and x/10  is " + x/10 ) ;
				System.out.println("Yes");
				return 0;
			} else if (sum==Integer.MIN_VALUE / 10 && x / 10 < -8) {
				 System.out.println("Is " + sum + "==" + Integer.MIN_VALUE / 10);
				 return 0;

			} else {
				x = x / 10;
				System.out.println("x is " + x);

			}


		}
		return sum;
	}
}
