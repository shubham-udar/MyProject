package com.LinkedList;
import java.util.*;
public class Test {

	
	public static void main(String [] args)
	{
//		LinkedList<String> a = new LinkedList<>();
//		
//		a.add("Sham");
//		a.add("Ram");
//		a.add("Sachin");
//		a.addFirst("Chaithanya");
//		a.addLast("Sanjay..");
//		System.out.println(a.get(3));
//		Iterator<String> itr = a.iterator();
//		
//		for(;itr.hasNext(); )
//		{
//			String s= itr.next();
//			System.out.println(s);
//		}
		
		
		LinkedList<String> animal = new LinkedList<>(Arrays.asList("Dog","Cat","Elephant"));
		
		LinkedList<String> animalsToremove = new LinkedList<>(Arrays.asList("Dog","Lion"));

		animal.removeAll(animalsToremove);
		System.out.println(animal);
		
	}
}
