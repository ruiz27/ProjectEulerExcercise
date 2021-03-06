package es.vass.projecteuler.practices;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem4Funcional {

	public void doExcercise() {

		Predicate<Integer> isPalindromic = p -> p.toString().equals(new StringBuilder(p).reverse().toString());
		IntUnaryOperator increment = p -> p + 1;

		List<Integer> list1 = IntStream.range(100, 999).map(increment).boxed().collect(Collectors.toList());
		List<Integer> list2 = IntStream.range(100, 999).map(increment).boxed().collect(Collectors.toList());

		List<Integer> result = list1.stream().flatMap(s1 -> list2.stream().map(s2 -> s1 * s2))
				.collect(Collectors.toList());
		;

		Integer l = result.stream()
		.filter(isPalindromic)
		.mapToInt(v -> v)
		.max().getAsInt();
		
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + l);
	}

	public static void main(String args[]) {
		Problem4Funcional solve = new Problem4Funcional();
		solve.doExcercise();

	}
}
