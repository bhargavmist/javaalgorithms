package main.java.com.javaalgorithms.arrays;

public class Array {
	
	int[] array = null;
	private int cnt = 0;
	
	public Array(int size) {
		array = new int[size];
	}
	
	public void populateArray(int val) {
		this.array[cnt++] = val;
	}
	
	public void printArray() {
		for (int i = 0; i < this.array.length; i++) {
			System.out.println("Val : " + this.array[i]);
		}
	}
	
	public static void main(String[] args) {
		Array arr = new Array(5);
		
		arr.populateArray(2);
		arr.populateArray(3);
		arr.populateArray(4);
		arr.populateArray(5);
		arr.populateArray(6);
		
		arr.printArray();
		
		
	}
}
