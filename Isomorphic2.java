public class Isomorphic2 {

	public static void main(String[] args) {
		String s = "badc";
		String t = "baba";
		System.out.println(isIsomorphic(s, t));
	}


		public static  boolean isIsomorphic(String s, String t) {
			boolean ret = true;
			char[] sa = s.toCharArray();
			char[] ta = t.toCharArray();
			if (ta.length != sa.length) {
				return false;
			}
			if (ta.length == 1 && sa.length == 1) {
				if (ta[0]==sa[0]) ret = true;
			}

			if( t.equals( s )) {
				return true;
			}

			for (int i = 0; i < ta.length; i++) {
				char key = sa[i];
				char val = ta[i];
				System.out.println("key is : " + key);
				System.out.println("value is : " + val);
						for (int j = i + 1; j < ta.length; j++) {
							if (key==sa[j]) {
								System.out.println("key at " + j + " is " + sa[j]);
								if (ta[j]!=val) {
									System.out.println("val at " + j + " is " + sa[j]);
									ret = false;
								}
							}
								if (val==ta[j]) {
									System.out.println("val at " + j + " is " + ta[j] );
									if (sa[j]!=key) {
										System.out.println("key at " + j + " is " + sa[j] );
										ret = false;
									}
							}
}
						}

			return ret;
		}

}