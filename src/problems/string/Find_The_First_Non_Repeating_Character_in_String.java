package problems.string;

import java.util.LinkedHashMap;

//Input: s = "geeksforgeeks"
//Output: 'f' (because 'f' is the first character that appears only once)
//Input: s = "racecar"
//Output: 'e' (because 'e' is the only character that appears only once)
//Input: s = "aabbccc"
//Output: '$' (because all characters in the string repeat)


import java.util.Map;

public class Find_The_First_Non_Repeating_Character_in_String {

	public static void find(String str) {
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		}
		
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			} 
		}
		 System.out.println(" ");

	}
	
	


	public static void main(String[] args) {
		String str = "aabbcc";
		find(str);
	}

}
