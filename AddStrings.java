
import java.util.*;

public class AddStrings {

	public static void main( String[] args) {
		String[] scramble = new String[]{"hos", "is" , "tal" ,"pit", "pi"};
		System.out.println(isWord(scramble, "hospital"));
		String sentence = new String("hello how are you");
		System.out.println(reverseStringwords(sentence));

	}

	public static boolean isWord(String[] scramble, String target) {
		boolean found = false;
		SortedMap<Integer, String> map = new TreeMap<>();
		for ( int i =0 ; i < scramble.length; i++) {
			if (target.contains(scramble[i])) {
				int k = target.indexOf(scramble[i]);
				map.put(k,scramble[i]);
			}

		}
		String retString = "";
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			retString = retString + entry.getValue();
		}
		System.out.println(retString);
		return (retString.equals(target));
	}

public static String reverseStringwords(String sentence) {
		int l = 0;
		int r =0;
		 char[] arr = sentence.toCharArray();
		 int right = 0;
		 int start = 0;
         String revString = "";

        while( right < arr.length ) {
        	while( arr[right] !=' ' && right <arr.length -1 ) {
			        right = right + 1;
			        System.out.println( "Value of right inside loop to check space " +  right);
	        }
        	System.out.println("right index is in beginning og loop" + right);
	        System.out.println("start index isi n beginning og loop " + start);
	        int end = right ;
	        System.out.println("len is " + end);
	        right = right -1;
	        System.out.println( "Moving right to " +  right );

	        System.out.println( "Swap from index " +  right + " To start  index " + start);

	        while( start < right) {
	        	char tmp = arr[start];
	        	arr[start] = arr[right];
				arr[right] = tmp;
				start = start +1 ;
				right = right -1;
	        }
	        right = end;
	        start = end;
	        System.out.println("right index is end of loop " + right);
	        System.out.println("start index is end of loop " + start);
            right ++;
            start ++;

        }


        for (char c: arr) {
	        revString = revString + c;
        }
        return revString;
}
}
