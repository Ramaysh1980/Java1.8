package com.ramaysh.jdk8;

import java.util.stream.IntStream;

public class SortedInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStream.of(1,9,4,3,2,7,8).sorted().forEach(x->System.out.println(x));
		
	}

}
