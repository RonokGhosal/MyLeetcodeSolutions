package DSA;

public class MergeSort {

	 public static void main(String[] args) {
		 int[] a = new int[]{4, 6, 2, 5, 7, 9, 1, 3};
		 int last = a.length - 1;
		  mergeSort(a, 0, last);
		  for (int i : a) {
		 	 System.out.println(i);
		  }
	 }

		 public  static void mergeSort(int[] a , int l,  int h) {
		 	if (l< h) {
		 		 int mid = (l +h)/2;
			    mergeSort(a,l,mid);
			    mergeSort(a,mid+1,h);
			    merge(a,l,mid,h);
		    }

		 }
		 public static void merge(int[]a, int l, int mid, int h) {
			 int i = l;
			 int j = mid +1;
			 int[] b = new int[a.length];
			 int k = l;
			 while (i <= mid && j <= h) {
				 if (a[i] < a[j]) {
					 b[k] = a[i];
					 i++;
				 }
				else {
					 b[k] = a[j];
					 j++;
				 }
				 k++;
			 }

			 if (i > mid) {
				 while (j <= h) {
					 b[k] = a[j];
					 k++;
					 j++;
				 }
			 }else {
				 while (i <= mid) {
					 b[k] = a[i];
					 i++;
					 k++;
				 }

			 }
			 for(int m = l; m<=h; m++) {
			 	a[m]= b[m];
			 }

		 }

	}

