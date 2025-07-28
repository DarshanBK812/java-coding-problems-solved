package functional_programming;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda2 {

	public static void main(String[] args) {
		List<String> list = List.of("spring boot", "spring data jpa","kaafk" , "kg" , "dd" ,"microservices");
//		list.stream().filter(name -> name.equals("spring boot")).forEach(System.out::println);
//		list.stream().filter(cource -> cource.length() > 4).forEach(System.out::println);
		
		//Print the number of characters in  each cource name
			list.stream().map(name -> name.length()).forEach(System.out::println);
		
	}
}
