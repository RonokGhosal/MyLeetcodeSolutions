import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public static void main(String[] args) {
		int[] nums = new int[]{0,1,2,4,5,7};
		List<String> rangeList = summaryRanges(nums);
		for (String str : rangeList) {
			System.out.println(str);
		}

	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> rangeList = new ArrayList<>();
		String first = String.valueOf(nums[0]);
		int seq = 0;
		String last = first;
		if (nums.length == 0 ) {
			return rangeList;

		} else if (nums.length == 1 ) {
			rangeList.add(first);
			return rangeList;

		} else {
			for (int i = 0; i <= nums.length - 2; i++) {
				System.out.println("i: " + i);
				if (nums[i + 1] - nums[i]!=1) {

					System.out.println("nums[i] is " + nums[i]);
					System.out.println("nums[i+1 ] is " + nums[i + 1]);
					System.out.println("seq " + seq);
					if (seq==0) {
						rangeList.add(String.valueOf(nums[i]));
						first = String.valueOf(nums[i + 1]);
					} else {
						last = String.valueOf(nums[i]);
						rangeList.add(first + "->" + last);
						seq = 0;
					}
					first = String.valueOf(nums[i + 1]);

				} else {
					System.out.println("nums[i] is " + nums[i]);
					System.out.println("nums[i+1 ] is " + nums[i + 1]);
					seq = seq + 1;
					System.out.println("seq " + seq);
				}
			}
			if ((nums[nums.length - 2] - nums[nums.length - 1])!=1) {
				if (seq==0) {
					rangeList.add(String.valueOf(nums[nums.length - 1]));
				} else {
					last = String.valueOf(nums[nums.length - 1]);
					rangeList.add(first + "->" + last);
				}
			}
		}
		return rangeList;
	}
}

