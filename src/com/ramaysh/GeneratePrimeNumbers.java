package com.ramaysh;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratePrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Prime numbers until 50:\n" + primeNumbersUnTil(50));
        System.out.println("\nPrime numbers within 10 and 31:\n" + primeNumbersInRange(10, 31));
    }

    static List<Integer> primeNumbersInRange(int s, int e) {
		
		return IntStream
				.rangeClosed(s, e)
				.filter(x->isPrime(x)).boxed()
				.collect(Collectors.toList());
	}

	static List<Integer> primeNumbersUnTil(int i) {
		// TODO Auto-generated method stub
		return IntStream
				.rangeClosed(2, i)
				.filter(x->isPrime(x)).boxed()
				.collect(Collectors.toList());
	}
	 
	static boolean isPrime(int num) {
		return num>1 && IntStream
				.range(2, num)
				.noneMatch(i->num%2==0);
		
	}

}
