package medium;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class KSmallestPairs {
	public static void main(String[] args) {
		int nums1[] = {1,7,11 };
		int nums2[] = {2,4,6};
		int k = 3;
		List<List<Integer>> pairs = kSmallestPairs(nums1, nums2, k);
		for (List<Integer> mylist: pairs) {
			for (Integer integer:mylist ) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}

	}


	 public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

	/*	PriorityQueue<int[]> pq = new PriorityQueue<int[]>((n1, n2) -> {
			if (n1[0] < n2[0]) {
				return 1;
			}
			if (n1[0] > n2[0]) {
				return -1;
			}
			return 0;
		});*/

	/*	 PriorityQueue<int[]> pq2 = new PriorityQueue<int[]>(new Comparator<int[]>() {
			 public int compare(int[] n1, int[] n2) {
				 if(n1[0] < n2[0]) {
					 return 1;
				 }
				 if(n1[0] > n2[0]) {
					 return -1;
				 }
				 return 0;
			 }
		 });*/
		//create Mi Heap
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
		// 2. Add all the pairs to the min heap with as array with all elements of num1, 0th elemnt of num 2, and 0 as sum.
		for (int i= 0; i < nums1.length -1 && i< k-1; i++) {

			pq.add(new int[]{nums1[i], nums2[0], 0});
			System.out.println("added in pq" + nums1[i] + " " +  nums2[0] + " " + 0);
	    }

		 // 3. Create a result list
		List<List<Integer>> result = new ArrayList<>();
// 4. Iterate until k
		while (k-- > 0 && !pq.isEmpty()) {
			// 5. Get the top element from the min heap
			System.out.println("pq top[0] is " + pq.peek()[0] );
			System.out.println("pq top[0] is " + pq.peek()[1] );
			System.out.println("pq top[0] is " + pq.peek()[2] );
			int[] current = pq.poll();
			System.out.println("currnt[0] is " + current[0] );
			System.out.println("currnt[1] is " + current[1] );
			System.out.println("currnt[2] is " + current[2] );
			// 6. Add the pair to the result list ( nums1 element and nums2 element
			result.add(Arrays.asList(current[0], current[1]));

			// 7. If the index of the second element is less than the length of the second array
			if (current[2] < nums2.length - 1) {
				// 8. Add the next pair to the min heap
				pq.offer(new int[]{current[0], nums2[current[2] + 1], current[2] + 1});
			}
		}

		// 9. Return the result list
		return result;




	}
}
