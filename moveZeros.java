public class moveZeros {

	public static void main(String[] args) {
		int[] array = new int[]{2,0,3,0,9,0,0,7};
		int[] movezeros = moveZeroes( array);
		for (int i = 0; i < movezeros.length; i++) {
			System.out.print(movezeros[i] + " ");
		}
		System.out.println();
	}

	public static int[] moveZeroes(int[] array) {
		int front = 0;
		int last = array.length - 1;
		boolean hasNonZero = false;
		while (front != last) {
			if (array[front]!=0 || array[last]!=0) {
				hasNonZero = true;
				break;
			}
			front++;
			last--;
		}

		if (hasNonZero) {
			for (int i = 0; i < array.length; i++) {

				if (array[i]==0) {

					for (int j = i; j < array.length - 1; j++) {
						array[j] = array[j + 1];
					}
					array[array.length - 1] = 0;
				}


			}

		}
		return array;

	}
}
