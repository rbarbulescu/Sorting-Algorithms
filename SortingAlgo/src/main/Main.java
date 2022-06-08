package main;

import sorting.bubble.BubbleSort;

public class Main {

	public static void main(String[] args) {
		// Array array[] = {400,321,2,5,1,5,1,78,75,100}

		int array[] = { 400, 321, 2, 5, 1, 5, 1, 78, 75, 100 };
		BubbleSort bubbleSortArray = new BubbleSort(array);
		bubbleSortArray.sort();

		if (bubbleSortArray.isSorted()) {
			System.out.println("Sorted array: ");
			printNumbers(bubbleSortArray.getArray());
		} else {
			System.out.println("The array is not sorted properly!");
		}

		bubbleSortArray.reverseSort();
		if (bubbleSortArray.isReverseSorted()) {
			System.out.println("Reverse sorted array: ");
			printNumbers(bubbleSortArray.getArray());
		} else {
			System.out.println("The array is not reversed properly!");
		}

	}

	static void printNumbers(int array[]) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i + 1 == array.length) {
				System.out.print(array[i]);
				System.out.print("]");
				System.out.println();
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
	}

}
