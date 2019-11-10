package algorithm;

import java.util.Arrays;
import java.util.Date;

/**
 * Optimization for BubbleSort.java. Takes into account the fact that largest
 * elements are pushed to the right.
 */
public class BubbleSort2 {

	private static int[] arr;

	public static int[] sort(int[] array) {
		arr = array;
		bubbleSort();
		return arr;
	}

	private static void bubbleSort() {
		int len = arr.length;
		for (int i = 0; i < len; ++i) {
			boolean noSwap = true;
			for (int j = 0; j < len - i - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1);
					noSwap = false;
				}
			}
			if (noSwap) {
				break;
			}
		}
	}

	private static int[] swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;

	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int[] test = { 21, 13, 1, -22, 51, 5, 18 };
		System.out.println(Arrays.toString(sort(test)));
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
