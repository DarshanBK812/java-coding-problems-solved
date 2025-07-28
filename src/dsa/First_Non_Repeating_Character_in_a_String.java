package dsa;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

//Return the first character that appears only once in a string.
//📥 Input: "aabbccddeefo" → 📤 Output: f

public class First_Non_Repeating_Character_in_a_String {

	public static void find(String str) {
		char ch[] = str.toCharArray();
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		for (char c : ch) {
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "aabbccddeefo";
		find(str); // f
	}

}
