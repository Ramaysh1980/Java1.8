package com.rams.core.java.basics;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] str=new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		
				
		int number=scan.nextInt();
		
	    String s=intergerToRoman(nums,str,number);
		System.out.println(""+s);
		

	}

	private static String intergerToRoman(int[] nums, String[] str, int number) {
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<nums.length;i++) {
			while(number>=nums[i]) {
				number-=nums[i];
				sb.append(str[i]);
	
			}
		}
				
		return sb.toString();
		
		
	}

}
