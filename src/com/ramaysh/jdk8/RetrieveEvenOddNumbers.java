package com.ramaysh.jdk8;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RetrieveEvenOddNumbers {

	public static void main(String[] args) {
    
		List<Integer> list=IntStream
				           .rangeClosed(2, 20)
				           .filter(i->i%2!=0).boxed()
				           .collect(Collectors.toList());
		System.out.println(list);
		
	}

}
