import java.text.DecimalFormat;

public class Salary {
	public static void main(String[] args) {
		int[] salary = new int[] {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
		System.out.println("Salary is " +  average(salary));

	}

	public static double average(int[] salary) {
		double max = 0;
		double min = Integer.MAX_VALUE;
		double sum = 0;

		for (int i= 0; i < salary.length; i ++ ) {
			if (salary[i] > max) {
				max = salary[i];
			}
			if (salary[i] < min) {
				min = salary[i];
			}
		  sum = sum + salary[i];
		}
		System.out.println("Min salary is" + min);
		System.out.println("Max salary is" + max);
		System.out.println("Sum" + sum);
		double totalSum = sum - max - min;
		System.out.println("totalSum" + totalSum);
		double num = (double)salary.length - 2.0;
		System.out.println("num" + num);

		double average = totalSum/num;
		return Math.round(average * 10000) / 10000d;
	}

	}
