package dsa;

import java.util.Arrays;
import java.util.Stack;

//Print all elements which are greater than all elements to their right.

//📥 Input: [16, 17, 4, 3, 5, 2] → 📤 Output: [17, 5, 2]

public class Leaders_In_An_Array {

	// Not recameneded
	public static void leaders(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1] || i == arr.length - 2)
				System.out.println(arr[i + 1]);
		}
	}

	// Correct logic refere this right leader
	public static void leaders2(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > max) {
				System.out.println(arr[i]);
				max = arr[i];
			}
			max = arr[i] > max ? arr[i] : max;
		}
	}

	// For left leadrer
	public static void leftLeaders(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				System.out.println(arr[i]);

			}
			max = arr[i] > max ? arr[i] : max;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 16, 17, 4, 3, 5, 2 };
//		leaders2(arr);
		leftLeaders(arr);

	}

}
