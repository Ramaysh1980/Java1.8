package com.rams.java.sorting;

public class SelectionSort {
	
	
	public void sort(int[] a) {
		
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min_index])
					min_index=j;
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
		}
		
	}
	
	void printArray(int[] a) {
		for(int aa:a) {
			System.out.print(aa+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {22,43,11,6,3};
		SelectionSort st=new SelectionSort();
		st.sort(arr);
		st.printArray(arr);

	}

}
