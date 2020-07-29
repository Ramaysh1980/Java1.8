package com.rams.core.java.patterns;

public class Pattern8 {

	public static void main(String[] args) {
		int size=5;
		int spaces=size-1;
		for(int i=1;i<=size;i++) {
			for(int k=1;k<=size;k++) {
				System.out.print("");
			}
			
			for(int j=1;j<=spaces;j++) {
				System.out.print("*");
			}
			spaces--;
			System.out.println();
		}
}

}
