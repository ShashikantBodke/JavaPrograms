package JavaQuestions;

import java.util.Arrays;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 30, 40, 40, 50, 50, 60, 60 };
		int len = arr.length;

		len = removeDuplicate(arr, len);

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	// Using Temp Array
//	public static int removeDuplicate(int arr[], int n) {
//		if (n == 0 || n == 1) {
//			return n;
//		}
//		int[] tmp = new int[n];
//		int j = 0;
//		for (int i = 0; i < n - 1; i++) {
//			if (arr[i] != arr[i + 1]) {
//				tmp[j++] = arr[i];
//			}
//		}
//		tmp[j++] = arr[n - 1];
//
//		// Changing original array
//		for (int i = 0; i < j; i++) {
//			arr[i] = tmp[i];
//		}
//		return j;
//	}

	
	
	//Using Separate Index
	public static int removeDuplicate(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0; //for next element
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}	
		
	
	
	
	
}
