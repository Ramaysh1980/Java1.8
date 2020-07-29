package com.rams.core.java.conversions;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter binary number 0 t0 1");
		Scanner scan=new Scanner(System.in);
		String bStr=scan.nextLine();
		 int dNum=binaryToDecimal(bStr);
		 if(dNum==-1) {
			 System.out.println("Invalid");
		 }else {
			 System.out.println("Decimal Nujmber is::"+dNum);
		 }
	
	}

	private static int binaryToDecimal(String bStr) {
		// TODO Auto-generated method stub
		int dnum=0;
		int num;
		for(int i=0;i<bStr.length();i++) {
		num=bStr.charAt(i)-48;
		;
		if(num!=0&&num!=1) {
			return -1;
			
		}
		 dnum=(dnum*2)+num;
		
		}
		return dnum;
		
	}

}
