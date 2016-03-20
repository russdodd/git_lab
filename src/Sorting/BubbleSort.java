package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] array) {
		//TODO: S1 implements bubble sort
		int flag = 1;
	  while(flag == 1){
		  flag = 0;
		  for (int i = 0; i < array.length - 1; i++){
			  int first = array[i];
			  int second = array[i+1];
			  if(first > second){
				  array[i] = second;
				  array[i+1] = first;
				  flag = 1;
			  }
		  }
	  }
    return array;
	}
}
