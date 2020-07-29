package com.ramaysh.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("ra","may","sh");
		
		Optional<String> o=l.stream().reduce((x,y)->{
			
			return x+y;
		});
		System.out.println(o.get());

	}

}
