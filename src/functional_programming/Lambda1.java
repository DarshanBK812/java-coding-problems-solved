package functional_programming;

import java.util.List;

public class Lambda1 {

	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 6, 5, 22, 11, 2, 3, 4, 5, 1, 2, 6, 4);

		// Print unique Even Numbers
//		integers.stream().distinct().filter(num -> num % 2 == 0).forEach(System.out::println);

		// Print the odd number
//		integers.stream().filter(num -> num % 2 != 0).distinct().sorted().map(n -> n * n).forEach(System.out::println);
		
		//Print the square of the even number
		integers.stream().filter(num -> num % 2 == 0).distinct().sorted().map(n -> n * n).forEach(System.out::println);
	}

}
