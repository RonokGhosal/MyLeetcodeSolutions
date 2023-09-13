import java.util.Stack;

public class IsValidNew {
	public static void main(String[] args) throws Exception {
		boolean check = isValid("([}}])");
		System.out.println("Manisha " + check);
	}


	public static boolean isValid(String s) {

		Stack stack = new Stack();
		int totalopen = 0;
		int totalclose = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
				totalopen++;
			}
			if (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}') {
				totalclose++;
			}
		}
		System.out.println("Manisha total open " + totalopen);
		System.out.println("Manisha total close " + totalclose);
		if (totalopen !=totalclose ) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
				stack.push(s.charAt(i));
				System.out.println("Manisha pushed " + s.charAt(i));
			} else if (s.charAt(i)==')' && !stack.isEmpty() && stack.peek().equals('(')) {
				System.out.println("Manisha top of stack is " + stack.peek() );
				stack.pop();

			} else if (s.charAt(i)==']' && !stack.isEmpty() && stack.peek().equals('[')) {
				System.out.println("Manisha top of stack is " + stack.peek() );
				stack.pop();
			} else if (s.charAt(i)=='}' && !stack.isEmpty() && stack.peek().equals('{')) {
				System.out.println("Manisha top of stack is " + stack.peek() );
				stack.pop();
			}

		}
		return (stack.isEmpty());

	}
}


