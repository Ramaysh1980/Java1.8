package com.ramaysh.jdk8;

import java.util.Arrays;
import java.util.List;


public class SumOfIntegers {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(2,3,4,1,5,6,7,7);
		
		int s=list.stream().mapToInt(i->i).sum();
		System.out.println("Sum Of Inregers::"+s);
	}

}
