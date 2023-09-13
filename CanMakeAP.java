import java.lang.reflect.Array;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class CanMakeAP {

	public static void main(String[] args) {
		int[] aar = new int[]{1,2,4};
		boolean ret = canMakeArithmeticProgression(aar);
		System.out.println(ret);
	}
		public static boolean canMakeArithmeticProgression(int[] arr) {
			boolean isAp= true;
			if (arr.length == 0 || arr.length == 1 ) {
				return false;
			}  else {

			 Arrays.sort(arr);
				int diff = Math.abs(arr[1] - arr[0]);
				for (int i = 0; i < arr.length -1 ; i++) {
                int newdiff = Math.abs(arr[i+1] - arr[i] );
				System.out.println("orig diff is"  + diff);
					System.out.println("new diff is"  + newdiff);
				if (newdiff != diff) {
						isAp = false;
					System.out.println(" isAp is set to " + isAp);
						return isAp;
				}
				}

			}
			return isAp;
			}
		}


