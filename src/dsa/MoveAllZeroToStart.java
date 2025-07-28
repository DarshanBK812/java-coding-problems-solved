package dsa;

import java.util.Arrays;

//✅ 8. Move All Zeros to start
//
//> Rearrange array so all 0s are at the first, maintaining order of non-zero elements.
//📥 Input: [0, 1, 0, 3, 12] → 📤 Output: [ 0, 0, 1, 3, 12]

public class MoveAllZeroToStart {

	public static void move(int arr[]) {
		int insertPos = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[insertPos--] = arr[i];
			}
		}
		while (insertPos >= 0) {
			arr[insertPos--] = 0;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 3, 12 };
		int left = 0;
		int mid = 0;
		int right = arr.length - 1;
		while (mid < right) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[left];
				arr[left] = temp;
				left++;
				mid++;
			} else if (arr[mid] != 0) {
				int temp = arr[mid];
				arr[mid] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
		move(arr);

	}

}
