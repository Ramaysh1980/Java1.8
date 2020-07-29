package com.rams.core.java.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count);
			}
			count--;
			System.out.println();
		}

	}

}
