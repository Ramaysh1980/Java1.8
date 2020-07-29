package com.ramaysh.jdk8;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> fun=(String x)->
										{
											return x.length();
											
										};
			System.out.println("Enter any String::");	
			Scanner scan =new Scanner(System.in);
			String s=scan.nextLine();
			int lenOfString=fun.apply(s);					
			System.out.println("Length Of the String::"+lenOfString);
			
		Function<Integer, Integer> f=(x)->
		{
			return x*x;
		};
		System.out.println("Enter any Number::");	
		Scanner scan1 =new Scanner(System.in);
		Integer num=scan1.nextInt();
		int square=f.apply(num);					
		System.out.println("Square Of the number::"+square);
		

	}

}
