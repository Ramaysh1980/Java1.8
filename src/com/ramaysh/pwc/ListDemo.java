package com.ramaysh.pwc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList<>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		
		List l2=new ArrayList<>();
		
		l2=l1;
		l1.add("four");
		System.out.println(l1);
		System.out.println(l2);
		
		Stream l3=l1.stream()
				    .map(x->x.equals("two"))
				    .skip(0);
		Object l4=l3.collect(Collectors.toList());
		System.out.println(l4);
		
				



	}

}
