package com.ramaysh.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleTheNumbers {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		List<Integer> doubleTheNumbers=list.stream()
				.map(i->i*2)
				.collect(Collectors.toList());
		System.out.println(doubleTheNumbers);
				
	}

}
