package es.vass.projecteuler.practices;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem4Funcional {


	private static Predicate<Integer> isPalindromic() {
		return p -> p.toString().equals(new StringBuilder(p).reverse().toString());
	}

	public void doExcercise() {
		
		List<Integer> list1 = IntStream.range(100, 999).map(x -> x+1).boxed().collect(Collectors.toList());
		List<Integer> list2 = IntStream.range(100, 999).map(x -> x+1).boxed().collect(Collectors.toList());
		
		List<Integer> result = IntStream.range(list1.size(), list2.size()).map(i -> list1.get(i) * list2.get(i)).boxed()
				.collect(Collectors.toList());
		;
		System.out.println(result.stream().filter(isPalindromic()).collect(Collectors.toList()));
	}

	public static void main(String args[]) {
		Problem4Funcional solve = new Problem4Funcional();
		solve.doExcercise();

	}
}
