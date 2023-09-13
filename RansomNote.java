import java.util.Arrays;

public class RansomNote {

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "aab"));
	}

	public static  boolean canConstruct(String ransomNote, String magazine) {
		if (magazine.indexOf(ransomNote) != -1) {
			return true;
		} else {
			char[] ransomArray = ransomNote.toCharArray();
			Arrays.sort(ransomArray);
			char[] magazineArray = magazine.toCharArray();
			Arrays.sort(magazineArray);
			int rptr = 0;
			int mptr = 0;

		 while (mptr < magazineArray.length) {
		 	System.out.println("ransomArray[rptr] is : " + ransomArray[rptr]);
			 System.out.println("magazineArray[mptr] is : " + magazineArray[mptr]);
				if (ransomArray[rptr]!=magazineArray[mptr]) {
					mptr++;
				} else {
					rptr++;
					mptr++;
				}
				if (rptr==ransomArray.length) return true;
			}
		}
		return false;
	}


	}

