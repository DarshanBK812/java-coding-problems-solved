package dsa;

//✅ 6. Check if Array is a Palindrome

//
//> Return true if the array reads the same from front and back.
//📥 Input: [1, 2, 3, 2, 1] → 📤 Output: true

public class Arrays_Palidrome {

	public static boolean check(int arr[]) {
		
		int left = 0, right = arr.length - 1;
		while (left < right) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 2, 1 };
		System.out.println(check(arr));

	}

}
