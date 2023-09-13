public class NoOfpaths {
public static void main( String[] args) {
	System.out.println(numberOfPaths(3,3));
}

	public static int  numberOfPaths(int m, int n){
		if ( n == 1 || m ==1) {
			return 1;
		}
		return(numberOfPaths(m-1,n ) + numberOfPaths(m,n-1));
	}
}
