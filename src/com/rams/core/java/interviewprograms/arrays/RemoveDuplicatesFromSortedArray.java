package com.rams.core.java.interviewprograms.arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[] {1,1,2,2,3,3};
		
		int result=RemoveDuplicates(a);
		System.out.println(result);

	}

	private static int RemoveDuplicates(int[] a) {
		// TODO Auto-generated method stub
		
		if(a.length<0)
			return 0;
		
		int j=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[j])
				a[++j]=a[i];
			}
		return ++j;
		
	}

}
