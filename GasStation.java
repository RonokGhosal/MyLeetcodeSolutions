package medium;

import java.lang.invoke.LambdaConversionException;

public class GasStation {

	public static void main( String[] args) {
		int gas[] = {1,2,3,4,5};
		int cost[] = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int deficit = 0;
		int balance = 0;
		int start = 0;

		for (int i = 0; i < gas.length; i++) {
			balance = balance + (gas[i] - cost[i]);
			System.out.println("balance is " + balance);
			if (balance < 0){
				deficit = deficit + balance;
				System.out.println("deficit is " + deficit);
				start = i + 1;
				System.out.println("start is " + start);
				balance = 0;
			}
		}
		int bd = deficit + balance;
		System.out.println("deficit + balance  is " + bd) ;
		if (deficit + balance >= 0){
			return start;
		}
		return -1;
	}
}

