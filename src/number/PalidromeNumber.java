package number;

import java.util.Arrays;

//Examples:
//121, 1221, 5445 are all palindromes because they remain unchanged when reversed. 

public class PalidromeNumber {

	public static boolean check(int num) {
		String str = "" + num;
		char ch[] = str.toCharArray();
		int l = 0, r = ch.length - 1;
		while (l <= r) {

			char c1 = (char) ch[l];
			char c2 = (char) ch[r];

			if (c1 != c2) {
				return false;
			}
			r--;
			l++;
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 13;
//		int num2 = num;
//		int rev = 0;
//		while (num > 0) {
//			rev = rev * 10 + num % 10;
//			num /= 10;
//		}

		if (check(num))
			System.out.println("Yes");
		else
			System.out.println("no");

	}

}
