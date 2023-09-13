package medium;

import javax.swing.text.html.HTMLDocument;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4};
		int[] letprod = productExceptSelf(nums);
		for (int i = 0; i < letprod.length; i++) {
			System.out.print(letprod[i] + " ");
		}
	}

	public static int[] productExceptSelf(int[] nums) {
		int[] out = new int[nums.length];
		int leftprod = nums[0];
		int rightprod = 1;
		out[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			leftprod = nums[i] * leftprod;
			out[i] = leftprod;
		}
		out[out.length -1] = out[nums.length -2];
System.out.println("Left array is ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		 for ( int i = nums.length-2; i > 0; i --) {
			System.out.println("i is " + i);
			 System.out.println("rightprod is  " + nums[i+1] + "* " + rightprod + "  rightprod");
			rightprod = nums[i+1] * rightprod;
			 System.out.println(out[i] + " = " +  out[i-1] + "* " + rightprod);
			out[i] = out[i-1] * rightprod;
			 System.out.println("out[i] is" + out[i]);
	}
		rightprod = rightprod *  nums[1];
		out[0] = rightprod;
		System.out.println("out[0] is" + out[0]);
		return out;
	}


}
