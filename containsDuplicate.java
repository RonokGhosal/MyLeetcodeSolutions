import javax.swing.text.Keymap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class containsDuplicate {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		System.out.println("is array " + nums + " duplicate ?" + containsDuplicate( nums));

	}

	public static boolean containsDuplicate(int[] nums) {
		if (nums.length <= 1) {
			return false;
		}
		Set<Integer> myset = new HashSet<Integer>();
		for (int i = 0; i <  nums.length  ; i ++) {
			System.out.println("ith " + i + " " + nums[i] );

			myset.add(nums[i]);
		}
		return (myset.size() != nums.length ? true: false);
	}


	public static boolean containsDuplicateNative(int[] nums) {
		if (nums.length <= 1) {
			return false;
		}
		boolean duplicate = false;

		for (int i= 0; i < nums.length; i ++ ) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					duplicate = true;
					break;
				}
		    }
		}
		return (duplicate);
	}
}
