package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthlargetElement2 {
	public static void main(String[] args) {
		int nums[] = {3, 2, 1, 5, 6, 4};
		int k = 2;

	}

	public static int kthlargetElement2(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Adding  "  + i + "element");
			pq.add(nums[i]);
		}
		for (int i = 0; i < k -1; i++) {

			 pq.poll();
		}


		return  pq.poll();
	}
}




