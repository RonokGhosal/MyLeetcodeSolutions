import java.awt.color.ICC_Profile;

public class FlowerBed {
	public static void main(String[] args) {
		int[] flowerbed = new int[]{0};
		boolean ret = canPlaceFlowers(flowerbed, 2);
		System.out.println("canPlaceFlowers returned " + ret);
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		boolean ret = false;
		if (n==0) {
			return true;
		}
		if (flowerbed.length ==1 && flowerbed[0] == 0) {
			if ( n ==1 ) {
				return true;
			} else {
				return false;
			}
		}

		for (int i = 0; i < flowerbed.length; i++) {
			if ((flowerbed[i]==0 && i==0 && flowerbed[i + 1]==0) || (flowerbed[i]==0 && i > 0 && i < flowerbed.length - 1 && flowerbed[i + 1]==0 && flowerbed[i - 1]==0) || (flowerbed[i]==0 && i==flowerbed.length - 1 && flowerbed[i - 1]==0)) {
				flowerbed[i] = 1;
				n = n - 1;
				if (n==0) {
					ret = true;
					break;
				}
			}
		}
		return ret;

	}
}



