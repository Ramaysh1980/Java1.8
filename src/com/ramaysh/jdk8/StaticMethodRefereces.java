package com.ramaysh.jdk8;

@FunctionalInterface
interface I{
	void m1();
	
}

class A{
	public static void test() {
		System.out.println("Implementation for m1-I");
	}
}
public class StaticMethodRefereces {

	public static void main(String[] args) {
 
		I obj=A::test;
		obj.m1();
	}

}
