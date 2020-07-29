package com.ramaysh.jdk8;

import java.util.stream.IntStream;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	int number=4;
	System.out.println("Factorial of"+number+"!::"+IntStream.rangeClosed(1, number).reduce(1, (x,y)-> x*y));
	}

}
