package com.bridgelabz.utility;

public class SortUtility {
	public void merge(String arr[], int beg, int mid, int end)  
	{

		int l = mid - beg + 1;
		int r = end - mid;

		String LeftArray[] = new String[l];
		String RightArray[] = new String[r];

		for (int i = 0; i < l; ++i)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < r; ++j)
			RightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = beg;
		while (i < l && j < r) {
			if ((LeftArray[i].compareTo(RightArray[j]))<=0)  {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	public void sort(String arr[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			sort(arr, beg, mid);
			sort(arr, mid + 1, end);
			merge(arr, beg, mid, end);
		}
		
	}
	/***********************************************************************/
		
		public static void frequencyCount(String[] strArr) {
		
			int count = 1, j = 0;

			for (int i = 0; i < strArr.length - 2; i++) {
				j++;
				if (strArr[i].equals(strArr[i + 1])) {
					count++;

				} else {
					System.out.print("Key: " + strArr[i] + " Value: " + count + " ");
					System.out.println();
					count = 1;
				}

			}
			if (strArr[j].equals(strArr[j + 1])) {
				count++;
				System.out.print("Key: " + strArr[j] + " Value: " + count + " ");

			}
	}
}
