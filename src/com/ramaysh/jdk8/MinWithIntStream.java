package com.ramaysh.jdk8;

import java.util.stream.IntStream;

public class MinWithIntStream {

	public static void main(String[] args) {
		
		int[] numbers= {10,30,40,5,90};
		IntStream.of(numbers)
		         .min()
		         .ifPresent(min->System.out.println(min));
		
	}

}
