public class NextGreatestLetter {
	public static void main(String[] args) {
		char[] letters = new char[]{'x','x','y' , 'y'};
		char target = 'z';
		char out = nextGreatestLetter(letters, target);
		System.out.println(" returned :" + out);
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		int inttarget = (int) target - 64;
		System.out.println( "target int value is " + inttarget);
		int[] intletters = new int[letters.length + 1];

		for (int i = 0; i < letters.length; i++) {
			int intval = (int) letters[i] - 64;
			System.out.println( "letters int value is " + intval);

			if (intval > inttarget) {
				System.out.println( "to be returned " + (char) (intval+ 64));
				return (char) (intval + 64);
			}
		}
		return letters[0];
	}
}
