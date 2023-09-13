// Note the smart way to avoid interger overflow :
// instead of x > mid*mid do a x/mid . mid

public class sqrRoot {

	public static void main(String[] args) {
		System.out.println("Squareroot of 2147395599 is " + mySqrt(2147395599));

	}

	public static int mySqrt(int x) {
		int start = 1;
		int end = x;
		int res = 0;

		while( end >=start) {
			int mid = start + (end -start) /2;
			System.out.println("mid is " + mid);
			if ( x/mid ==  mid) return mid;
			else {
				if ( mid  > x/mid) {
					end = mid -1;
				} else {
					start = mid +1;
					res = mid;
				}
			}
			System.out.println("start is " + start);
			System.out.println("end is " + end);
		}
		return res;
	}
}
