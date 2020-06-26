package es.vass.projecteuler.practices;

import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13. What is the 10 001 st prime number?
 *
 */
public class Problem7Funcional {

	public Integer doExcercise(Integer stNumber) {

		int num = 0;
		int cont = 0;
		do {
			if (isPrime.test(num)) {
				cont++;
			}
			num++;
		} while (cont <= stNumber);

		return num;
	}

	Predicate<Integer> isPrime = p -> {
		return !IntStream.rangeClosed(2, p / 2).anyMatch(i -> p % i == 0);
	};

}
