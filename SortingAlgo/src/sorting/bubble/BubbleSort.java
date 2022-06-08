package sorting.bubble;

import sorting.SortingInterface;

public class BubbleSort implements SortingInterface {
	private int array[];

	public BubbleSort(int array[]) {
		this.array = array;
	}

	public int[] getArray() {
		return this.array;
	}

	@Override
	public boolean isSorted() {
		int sortedNumbers = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] < array[i] || array[i - 1] == array[i]) {
				sortedNumbers++;
			}
			if (sortedNumbers == array.length - 1) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isReverseSorted() {
		int sortedNumbers = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i] || array[i - 1] == array[i]) {
				sortedNumbers++;
			}
			if (sortedNumbers == array.length - 1) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void reverseSort() {
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[j] < array[i]) {
					swap(array, j, i);
				}
			}
		}
	}

	@Override
	public void sort() {
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[j] > array[i]) {
					swap(array, j, i);
				}
			}
		}
	}

	private static void swap(int array[], int a, int b) {
		int aux = array[a];
		array[a] = array[b];
		array[b] = aux;
	}

}
