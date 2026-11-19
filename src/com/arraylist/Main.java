package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;


class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String S1, String S2) {
		// TODO Auto-generated method stub
		return  S1.length()-S2.length();
	}
	
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
}
public class Main {
	
	public static void main(String[] args)
	{
//		int[] arr = new int[10];
		
//		ArrayList<Integer> al = new ArrayList<>(11);
		
//		System.out.println(al.size());
		
		/*for(int i=0; i<=11;i++)
		{
			al.add(i);
		}
		al.add(12);
		for(int a : al)
		{
			System.out.println(a);
		}*/
		
//		List<String> al = new ArrayList<>();
//		System.out.println(al.getClass().getName());
//		
//		List<String> all = Arrays.asList("Monday","Thusday");
//	    System.out.println(al.getClass().getName());
//	    all.set(1,"Wedensday");
//	    System.out.println(all.get(1));
//	    
////		System.out.println(al.getClass().getName());
//		
//		String[] arraay = {"apple","Banana","Cherry"};
//		List<String> alll = Arrays.asList(arraay);
//		System.out.println(al.getClass().getName());
//		
//		
//		al.addAll(all);		
//	

		
	/*	ArrayList<String> fruit = new ArrayList<>();
		System.out.println("Berfore Removing Emement....");
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Apple");
		fruit.add("Cherry");
		fruit.add("Pineaple");
		
		for(String a :fruit)
		{
			System.out.println(a);
		}
		
		System.out.println("\n After Removing Emement....\n");
		
		fruit.remove(2);
		
		for(String a :fruit)
		{
			System.out.println(a);
		}
		*/
		
//		ArrayList<Integer> al = new ArrayList<>();
//		
//		al.add(12);
//		al.add(18);
//		al.add(13);
//		
//	   al.sort( new MyComparator());
//	
//	   System.out.println(al);
		
		
//		ArrayList<String> al = new ArrayList<>();
		
		
		List<String> words = Arrays.asList("Banana","apple","date");
		words.sort(new StringLengthComparator());
		System.out.println(words);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		al.add(10);
//		al.add(12);
//		al.add(13);
//		al.add(18);

		
		
//		al.set(2,15);
//		
//		for(int x:al)
//		{
//			System.out.println(x);
//		}
//	    
	   
	}

//	private static ListIterator<> Iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
