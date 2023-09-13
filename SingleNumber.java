import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args) {
		int [] nums = new int[]{2,0,0,1,1};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i =0; i <nums.length; i ++ ) {
          result = result ^ nums[i];
		}
        return result;
	}
}
