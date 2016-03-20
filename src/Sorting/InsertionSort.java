package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		for(int i=1; i<unsortedArray.length; i++) {
			int temp = unsortedArray[i];
			int j;
			for(int j=i-1; j >= 0 && temp < unsortedArray[i]; j--) {
				unsortedArray[j+1] = unsortedArray[j];
			}
			array[j+1] = temp;
		}
		return unsortedArray;
	}
}
