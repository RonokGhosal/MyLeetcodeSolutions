package medium;


import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesMoreThanTwo  {

	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3};
		int last = removeDuplicates(nums);
		for (int i =0; i < last; i ++ ) {
			System.out.println(nums[i]);
		}
		System.out.println(last);
		List list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.set(1,7);
	}

	public static int removeDuplicates(int[] nums) {
		if ( nums.length <3 ) {
			return nums.length;

		}
		int s = 1;
		int f= 2;
		while( f< nums.length){
			System.out.println("nums[f]:" + nums[f]);
			System.out.println(" nums[s-2]:" +  nums[f-2]);
			if (nums[f] != nums[f-2]) {
				s++;
			} else {
				nums[s] = nums[f];
			}
			f++;

			System.out.println("s:" + s);
			System.out.println("f:" + f);
		}
		return s +1 ;
	}
}
