package com.rams.core.java.basics;

public class SapinesTest1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		test(new Integer(10));
		test(20.0f);
		test(10);
		test(20.0);
	}
	static void test(Number number) {
		System.out.println(number.toString());
	}

}
