package com.ramaysh.jdk8;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int start=2;
		int end=20;
		System.out.println("Prime Number OR Not::"+isPrime(n));
		//System.out.println("Generate Prime Numberrs:"+generatePrimes(start,end));

	}
	
	

	static boolean isPrime(int num) {
		return num >1 && IntStream.range(2, num).peek(x->System.out.println(x))
				.noneMatch(i->num%i==0);
}
	

}
