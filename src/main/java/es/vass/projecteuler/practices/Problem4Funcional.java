package es.vass.projecteuler.practices;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem4Funcional {

	public void doExcercise() {
		
		Predicate<Integer> isPalindromic = p -> p.toString().equals(new StringBuilder(p).reverse().toString());
			
		List<Integer> list1 = IntStream.range(100, 999).map(x -> x+1).boxed().collect(Collectors.toList());
		List<Integer> list2 = IntStream.range(100, 999).map(x -> x+1).boxed().collect(Collectors.toList());
		
		List<Integer> result = list1.stream()
		        .flatMap( s1 -> list2.stream().map( s2 -> s1 * s2 ) )
		        .collect( Collectors.toList() );
		;
		
		System.out.println(result.stream().filter(isPalindromic).collect(Collectors.toList()));
	}

	public static void main(String args[]) {
		Problem4Funcional solve = new Problem4Funcional();
		solve.doExcercise();

	}
}
