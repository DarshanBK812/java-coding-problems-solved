package dsa;

import java.util.HashSet;
import java.util.Set;

public class FindTheLongestSubstringWithoutRepeantingCharacter {

	public static void main(String[] args) {
		String str = "abcad";
		int length = 0;
		int maxLength = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i))) {
				set.remove(str.charAt(i));
				length++;
			}
			set.add(str.charAt(i));
			maxLength = i - length + 1;
		}

		System.out.println("maxLength :" + maxLength);
		System.out.println(length);
		for (int i = length; i <= maxLength; i++) {
			System.out.println(str.charAt(i));
		}

	}

}
