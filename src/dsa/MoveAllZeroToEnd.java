package dsa;

import java.util.Arrays;

//✅ 8. Move All Zeros to End
//
//> Rearrange array so all 0s are at the end, maintaining order of non-zero elements.
//📥 Input: [0, 1, 0, 3, 12] → 📤 Output: [1, 3, 12, 0, 0]

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 3, 12 };
		int left = 0;
		int mid = 0;
		int right = arr.length - 1;
		while (mid < right) {
			if (arr[mid] != 0) {
				int temp = arr[mid];
				arr[mid] = arr[left];
				arr[left] = temp;
				left++;
				mid++;
			} else if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[right];
				arr[right] = temp;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
