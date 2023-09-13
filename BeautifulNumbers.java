public class BeautifulNumbers {

	public static void main(String[] args) {
		 int[] nums = new int[]{9586,9657,3457,1067,7146,4211,5987,2145,3001,359,1356,2347,801,2413,3857,2226,3321,503,3249,8536,1857,8899,1025,7712,6609,872,4802,9727,9198,9931,5928,1927,5395,3788,6561,4458,659,1824,7066,8751,7804,309,8994,9769,5656,8054,7485,9973,5618,2811,1016,9936,933,2798,4049,2196,694};
		//int[] nums = new int[]{106,1649};
		System.out.println(countBeautifulPairs(nums ));
	}

	public static int countBeautifulPairs(int[] nums) {
		int count =0;
		for ( int i =0; i < nums.length ; i++) {
			for ( int j =i+1 ; j < nums.length; j++) {
               int first = nums[i];
               while(first>= 10) {
               	first = first/10;
              }

              int last =  nums[j] %10;
				System.out.println("first is " + first);
				System.out.println("last is " + last);
				if (findgcf(first, last ) == 1 ){
					System.out.println("i is : "+ i + " j is : " + j);
					System.out.println("nums[i] is : "+ nums[i]  + " nums[j] is : " + nums[j]);
					System.out.println("Beautiful Pair " + first+ "," + last);
					count= count +1;
				}
			}
		}
return count;
	}

	public static int findgcf(int x,  int y) {
		int gcf =1;
		for(int i =1 ;i <=x && i <=y ; i++) {
			if (x%i == 0 && y %i == 0) gcf =i;
		}
		return gcf;
	}
}
