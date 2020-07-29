package com.ramaysh.jdk8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IfStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> result =
			    IntStream.rangeClosed(1, 10)
			             .filter(i -> 10 % i == 0)
			             .flatMap(i -> i == 5 ? IntStream.of(i) : IntStream.of(i, 10 / i))
			             .boxed()
			             .collect(Collectors.toList());
		System.out.println(result);

	}

}
