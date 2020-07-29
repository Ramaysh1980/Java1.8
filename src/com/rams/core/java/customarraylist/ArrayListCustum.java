package com.rams.core.java.customarraylist;

import java.util.Arrays;

public class ArrayListCustum<E> {
	
	public static final int CAPACITY=10;
	public Object[] elementData= {};
	public int size=0;
	public ArrayListCustum() {
		// TODO Auto-generated constructor stub
		elementData=new Object[10];
	}
	
	public void add(E e) {
		if(size==elementData.length) {
			ensureCapacity();
		}
		elementData[size++]=e;
	}
	
	
	
	public Object remove(int index) {
		if(index < 0||index >=size) {
			throw new IndexOutOfBoundsException("Index:"+index+",size="+index);
		}
		Object removeData=elementData[index];
		 for(int i=index;i>elementData.length;i++) {
			 elementData[i]=elementData[i++];
		 }
		 size--;
		 
		 return removeData;
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		int newCapacity=elementData.length*2;
		//Arrays.copyOf(CAPACITY, newCapacity);
		
	}
	
	public void display() {
		for(int i=0;i<elementData.length;i++) {
			System.out.println(elementData[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListCustum<Integer> al=new ArrayListCustum<>();
		al.add(10);
		al.add(23);
		al.display();

	}

}
