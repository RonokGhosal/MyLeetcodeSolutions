package DSA;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = new int[]{4,6,2,5,7,9,1,3};
		int last = a.length -1;
		quickSort(a, 0, last);
		for (int i: a) {
			System.out.println(i);
		}
	}

	public static void quickSort( int[] a, int l, int h) {
		if ( l < h) {
			int pivot = partition(l,h,a);
			quickSort(a, l,pivot -1);
			quickSort(a, pivot +1, h);
		}
	}


	 static int partition(int l, int h, int[] a) {
		int pivot = a[l];
		int i = l;
		int j = h;
		while (i < j) {

			while (a[i] <=pivot) {
				i++;
			}
			while (a[j] >pivot) {
				j--;
			}
			if ( i <j) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}

		}
		//swap pivot with a[j]
		int tmp = a[j];
		a[j] = a[l];
		a[l] = tmp;
		return j;
	}
}
