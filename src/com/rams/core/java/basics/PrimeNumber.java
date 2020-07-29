package com.rams.core.java.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,3,5,7,11,13.....
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}else {
		System.out.println("not prime");
		
		}

	}

}
