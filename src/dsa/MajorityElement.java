package dsa;

import java.util.HashMap;
import java.util.Map;

//✅ 5. Find the Majority Element
//
//> Element that appears more than n/2 times.
//📥 Input: [3, 3, 4, 2, 3, 3, 3] → 📤 Output: 3

//arr = {1, 1, 2, 2}
//n = 4
//n/2 = 2



public class MajorityElement {
	
	public static void findMajorityElement(int arr []) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int n = arr.length;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > (n/2)) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		int arr [] = {3, 3, 4, 2, 3, 3, 3};
		findMajorityElement(arr);
	}

}
