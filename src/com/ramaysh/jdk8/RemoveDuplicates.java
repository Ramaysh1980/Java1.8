package com.ramaysh.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,1,2,2,3,3,4,4);
		
		List<Integer> removeDuplicates=l.stream()
				                        .distinct()
				                        .collect(Collectors.toList());
		System.out.println(removeDuplicates);
	}

}
