package DSA;

import javax.security.auth.login.AccountException;
import javax.xml.stream.events.StartDocument;
import java.util.Stack;

public class StackCodes {

	public static void main(String[] args) {
		int[] a = new int[]{4,10,5,8,20,15,3,12};
		findnearestLow(a);
	}

	public static void findnearestLow(int[] a) {
		Stack<Integer> stack = new Stack<>();


		for (int i = 0; i < a.length; i++) {
			while (!stack.isEmpty() && a[i] < stack.peek()) {

				int n = stack.pop();
				//System.out.println("Popped " + n);
			}
			if (!stack.isEmpty())
				System.out.print(stack.peek() + " ");
			else {
				System.out.print(-1 + " ");
			}
		//	System.out.println( "pushing " + a[i]);
			stack.push(a[i]);
		}
	}

}
