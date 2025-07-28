package number;

import java.util.HashMap;
import java.util.Map;

//For example, the number 192 is considered fascinating because: 192 x 1 = 192, 192 x 2 = 384, and 192 x 3 = 576. 
//Concatenating these results yields 192384576, which includes all digits from 1 to 9 exactly once.

public class FacinatingNumber {

	static int count(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	static boolean facinating(int num) {

		String str = "" + num + num * 2 + num * 3;

		char ch[] = str.toCharArray();
		boolean b = true;
		for (char c = '1'; c <= '9'; c++) {
			int count = 0;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == c) {
					count++;
				}
			}
			if (count > 1) {
				b = false;
				return false;
			}
		}

		return true;

	}

	public static boolean check2(int num) {
		Map<Character, Character> map = new HashMap<>();
		String str = "" + num * 1 + num * 2 + num * 3;
		char ch[] = str.toCharArray();
		for (char c : ch) {
			map.put(c, (char) (map.getOrDefault(c, (char) 0) + 1));
		}

		for (Map.Entry<Character, Character> entry : map.entrySet()) {
			if (entry.getValue() != 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int num = 192;
//		if (count(num) >= 3) {
//			if (facinating(num))
//				System.out.println("Yes");
//			else
//				System.out.println("no");
//		} else {
//			System.out.println("no");
//		}
		System.out.println(check2(num));
	}

}
