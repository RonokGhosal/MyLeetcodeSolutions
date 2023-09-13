public class isValid {
	public static void main(String[] args) throws Exception {
		boolean check = checkValid("([)]");
		System.out.println("Manisha " + check);

	}

	public static boolean checkValid(String s) {

		if (s.length() <= 1 || s.length() % 2!=0) {
			return false;
		}
			int NOTFOUND=1000000000;

			if (s.length() <= 1 || s.length() % 2!=0) {
				return false;
			}
			int roundopenidx = NOTFOUND;
			int roundcloseidx = -1;
			int curlyopenidx = NOTFOUND;
			int curlycloseidx = -1;
			int sqropenidx = NOTFOUND;
			int sqrclosenidx = -1;
			int countroundopen = 0;
			int countroundclose = 0;
			int countcurlyopen = 0;
			int countcurlyclose = 0;
			int countsqropen = 0;
			int countsqrclose = 0;


			boolean valid = false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)=='(') {
					roundopenidx = i;
					countroundopen++;

				}
				if (s.charAt(i)==')') {
					roundcloseidx = i;
					countroundclose++;
				}

				if (s.charAt(i)=='{') {
					curlyopenidx = i;
					countcurlyopen++;
				}

				if (s.charAt(i)=='}') {
					curlycloseidx = i;
					countcurlyclose++;
				}
				if (s.charAt(i)=='[') {
					sqropenidx = i;
					countsqropen++;
				}

				if (s.charAt(i)==']') {
					sqrclosenidx = i;
					countsqrclose++;
				}
			}
			int diffroundidx = (roundcloseidx - roundopenidx) %2;
			System.out.println("diffroundidx is  :"  + diffroundidx);
			System.out.println("diffroundidx is  :"  + diffroundidx);

			if ( roundcloseidx > roundopenidx   && diffroundidx != 0 && countroundopen==countroundclose) {
				valid = true;
			}
			else if (roundopenidx == 1000000000 &&  roundcloseidx == -1){
				valid = true;
			}
			else {
				valid = false;
				return valid;
			}

			int diffcurlyidx = (curlycloseidx - curlyopenidx  ) %2;
			System.out.println("diffcurlyidx is  :" + diffcurlyidx);
			if ( curlycloseidx != -1 && curlycloseidx > curlyopenidx  &&  diffcurlyidx !=0 && countcurlyopen==countsqrclose) {
				valid = true;
			}
			else if (curlyopenidx == 1000000000 && curlycloseidx == -1 ){
				valid = true;
			}
			else {
				valid = false;
				return valid;
			}

			int	diffrsqridx = (sqrclosenidx - sqropenidx) % 2;
			System.out.println("diffrsqridx is  :" + diffrsqridx);
			if (sqrclosenidx != -1 && sqrclosenidx > sqropenidx   && diffrsqridx != 0  && countsqrclose==countsqropen) {
				valid = true;
			}
			else if (sqropenidx == 1000000000 && sqrclosenidx == -1 ){
				valid = true;
			}
			else {
				valid = false;
				return valid;
			}

			return valid;
		}

	}

