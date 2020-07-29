package com.ramaysh.jdk8;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseNumberJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.iterate("*",s->s +"*")
		      .takeWhile(s->s.length()<7)
		      .forEach(System.out::println);
		int num=153;
		Optional<Integer> result=Stream.iterate(num, n->n/10)
		      .map(r->r%10)
		      .map(s->s*s*s)
		     // .peek(x->System.out.println(x))
		      .takeWhile(e->e!=0)
		      .reduce((res,a)->res+a);
		System.out.println(result);
		 if(result.get()==num){
		    	System.out.println("Given Number is "+num+" equal to result number" + result.get() );
		    }
		    else {
		    	System.out.println("Given Number is "+num+" NOT EQUAL to result number" +result.get());
		    }
		       
		      //.forEach(res->System.out.println(res));
		
		      
		
		/*int num=153;
		int result=0;
	    System.out.println("****Reverse Number****");
	    result=reverseNum(num);
	    if(result==num) {
	    	System.out.println("Given Number is"+num+" equal to result number"+result );
	    }
	    else {
	    	System.out.println("Given Number is "+num+" NOT EQUAL to result number"+result);
	    }
	    
	    Function<Integer, Integer> fun=n->
	    {
	    	int rev=0;
	    	while(n!=0) {
	    		int r=0;
				r=n%10;
				rev=rev+(r*r*r);
				n/=10;
	    	}
			return n;
	    };
	    
	    int r=fun.apply(153);
	    int n = 0;
		//System.out.println(r);
	    if(r==n) {
	    	System.out.println("Given Number is"+n+" equal to result number"+r );
	    }
	    else {
	    	System.out.println("Given Number is "+n+" NOT EQUAL to result number"+r);
	    }
	    
	    		
	}

	private static int reverseNum(int num) {
		// TODO Auto-generated method stub
		int rev=0;
		while(num!=0) {
			int r=0;
			r=num%10;
			rev=rev+(r*r*r);
			num/=10;
		}
		return rev;
		
		
		         
	*/	         
		         
	}
	

}
