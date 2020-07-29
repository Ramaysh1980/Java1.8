package com.ramaysh.jdk8;

import java.util.Optional;
import java.util.stream.Stream;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		Optional<Integer> result=Stream.iterate(num, n->n/10)
				                 .map(n->n%10)
				                 .takeWhile(e->e!=0)
				                 .reduce((a,b)->a+b);
		System.out.println("Sum Of Digits" + "(" +num+ ")" +"::" +result.get());
		
		int n=5;
		Integer fact=Stream.iterate(1,m->{
			                         System.out.println("mm::"+m);
		                             return m+1;
		                              
		                          })
				           .takeWhile(e->e<=n)
			               .reduce(1,(x,y)->{
			                	
			                	    System.out.println(">>"+x*y);
			                	    return x*y;
			                		
			                		} );
		System.out.println("Factorial Of the given number" + "(" +n+ ")" +"::" +fact);
		
				                 

	}

}
