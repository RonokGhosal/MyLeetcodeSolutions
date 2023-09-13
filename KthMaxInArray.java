package medium;

import java.util.PriorityQueue;

public class KthMaxInArray {
	public static void main(String[] args) {
		int [] nums = new int[] {2,5,4, 8,6,9};
		System.out.println(findKthLargest(nums,2));
		System.out.println(MinSumofJoiningRpoes(nums));
	}




	public static int MinSumofJoiningRpoes(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue();
		for (int i =0; i < nums.length; i ++) {
			pq.add(nums[i]);
		}
		while ( pq.size() > 1) {
			int x = pq.poll();
			int y = pq.poll();
			pq.add(x+y);
		}
		return pq.poll();
	}


	public static int findKthLargest(int[] nums, int k) {


				PriorityQueue<Integer> pq = new PriorityQueue();
				for (int i = 0; i < k; i++) {
					pq.offer(nums[i]);
				}
				for (int i = k; i < nums.length; i++) {
					if (pq.peek() < nums[i])
					{
						pq.poll();
						pq.offer(nums[i]);
					}
				}

				return pq.peek();
			}

	}

