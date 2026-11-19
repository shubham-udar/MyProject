package com.vector;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args)
	{
		Vector<Integer> vector = new Vector<>(5,3);
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		System.out.println(vector.capacity());
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		Vector<Integer> vv = new Vector<>(ll);
		System.out.println(vv);
	}

}
