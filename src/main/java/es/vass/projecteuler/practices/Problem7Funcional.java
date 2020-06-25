package es.vass.projecteuler.practices;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13. What is the 10 001st prime number?
 *
 */
public class Problem7Funcional {

	public Integer doExcercise(Integer stNumber) {
		IntUnaryOperator increment = p -> p + 1;
		List<Integer> list1 = IntStream.range(1, 100).map(increment).boxed().collect(Collectors.toList());

		List<Integer> primes = list1.stream().filter(isPrime).mapToInt(v -> v).boxed().collect(Collectors.toList());

		return primes.get(stNumber - 1);

	}

	// max result > 2; not prime
	Predicate<Integer> isPrime = p -> {
		List<Integer> list = IntStream.rangeClosed(1, p).map(i -> {
			float num = (float) p / i;
			if (num % 1 == 0) {
				return i;
			} else {
				return 0;
			}
		}).boxed().filter(s -> s > 0).collect(Collectors.toList());

		if (list.size() == 2) {
			return true;
		} else {
			return false;
		}
	};

}
