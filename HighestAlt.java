import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class HighestAlt {

	public static void main(String[] args) {
		int[] gain = new int[]{-5, 1, 5, 0, -7};
		int max = largestAltitude(gain);
		System.out.println("Mxx altitude is " + max);
	}

	public static int largestAltitude(int[] gain) {
		int max = 0;
		int res = 0;

		for (int alt : gain) {
			max = alt + max;
			res = Math.max(max, res);
		}
		return res;
	}
}

