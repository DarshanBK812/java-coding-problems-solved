package dsa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//4. Find the Missing Number
//
//> Array has numbers from 1 to n, one is missing.
//📥 Input: [1, 2, 4, 5] → 📤 Output: 3

public class Find_The_Missing_Number {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6 };
//		int arr[] = { 2, -2, 4, -3, 1, -1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i] - arr[i - 1];
			if (val != 1) {
				System.out.println((arr[i] + arr[i - 1]) / 2);//o/p :- 0 , 3
			}
		}
	}

}
