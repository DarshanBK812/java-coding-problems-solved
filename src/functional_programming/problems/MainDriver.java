package functional_programming.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {
	public static void main(String[] args) {
		
		List<Emplyoee> emplyoees = Arrays.asList(
				new Emplyoee(1, "abc", 21, 213123),
				new Emplyoee(1, "pqr", 26, 213123),
				new Emplyoee(1, "mno", 28, 213123), 
				new Emplyoee(1, "jkl", 22, 213123),
				new Emplyoee(1, "xyz", 23, 213123));
		
		System.out.println(emplyoees.stream().map(e ->{ 
			if(e.getAge() > 25) {
				e.setSal(e.getSal()* 0.1);
			}
			return e;
		}
		).toList() );
		
	}
	
	
}
