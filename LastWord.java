public class LastWord {
	public static void main(String[] args) throws Exception {
		String s = "   fly me   to   the moon  ";

	System.out.println(lengthOfLastWord( s) );
	}

	public static int lengthOfLastWord(String s) {
		String[] words = s.trim().split(" ");
		return s.trim().split(" ")[words.length -1].length();
	}


}
