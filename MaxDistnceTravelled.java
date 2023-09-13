public class MaxDistnceTravelled {
	public static void main(String args[]) {
		int maxDistance =  distanceTraveled(5, 10);
		System.out.println("Max Distance is " + maxDistance);
	}

	public static int distanceTraveled(int mainTank, int additionalTank) {
         int distance = 0;
         int initialmainTank = mainTank;
		while (additionalTank >= 0 && mainTank >= 1) {
			distance = distance +10;
			mainTank = mainTank - 1;
			if (mainTank == initialmainTank - 5 && additionalTank >0 ) {
				additionalTank = additionalTank - 1;
				mainTank = mainTank + 1;
				initialmainTank = mainTank;
			}
		}
		return distance;
	}
}
