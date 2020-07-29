package com.ramaysh.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxElement {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,30,40,50,70);
		Optional<Integer> o=list.stream()
				          .max((x,y)->
				          {
				           return  x.compareTo(y);
				          }
				          );
		System.out.println(o.get());
		
	}

}
