package medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianOfStreamOfIntegers {
 static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

	public static void add(int num) {

		if (maxHeap.isEmpty() || num > maxHeap.peek()) {
			maxHeap.add(num);
		} else {
			minHeap.add(num);
		}

		if ( minHeap.size() > maxHeap.size() +1  ) {
			maxHeap.add(minHeap.poll());
		} else

		if (maxHeap.size() < minHeap.size() ) {
			maxHeap.add(minHeap.poll());
		}
	}

//pass maxHead and minHeap
	public static double getMedian() {
		double median;
	  if (maxHeap.size() == minHeap.size()) {
		  return ((maxHeap.poll() + minHeap.poll()) / 2.0);
	  }
	  else {
	  	return maxHeap.poll();
		  }



	}



}

