package com.rams.core.java.interviewprograms.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	private static void removeDiplicates(int[] a) {
		// TODO Auto-generated method stub
		int noOfElements=a.length;
		for(int i=0;i<noOfElements;i++) {
			for(int j=i+1;j<noOfElements;j++) {
				if(a[i]==a[j]) {
					a[j]=a[noOfElements-1];
					noOfElements--;
					j--;
				}
			}
			
		}
		int[] b=Arrays.copyOf(a, noOfElements);
		System.out.println(Arrays.toString(b).toCharArray());
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,2,1,3,67,89,3,1};
		//System.out.println(removeDiplicates(Arrays.copyOf(a, arg1)));
		removeDiplicates(a);
	}


		
		
	}

