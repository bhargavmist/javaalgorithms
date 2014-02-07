package main.java.com.javaalgorithms.sort;

public class BubbleSort {
	
	int[] array = {12, 22, 1, 4, 7, 8, 65, 32, 6, 10};
	int arraySize = array.length;
	
	public BubbleSort() {
		
	}
	
	public void sort() {
		for (int i = arraySize -1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j+1]) {
					exchange(j, j+1);
				}
			}
		}
	}
	
	private void exchange(int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
	public void printArray() {
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
	
	public static void main(String[] args) {
		BubbleSort bsort = new BubbleSort();
		
		bsort.sort();
		bsort.printArray();
		
	}
}

