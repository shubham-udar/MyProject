package com.Vector1;
import java.util.Vector;
import java.util.Stack;

public class Test {
	
	public static void main(String [] args)
	{

//		Vector<Integer> v = new Vector<>();
//		
//		for(int i=1 ; i<=10;i++)
//		{
//			v.add(i);
//		}
//		
////	    System.out.println(v.get(2));
//		System.out.println(v.remove(2));
//		System.out.println(v);
		
		
		Stack<Integer> s = new Stack<>();
		
		for(int i = 1 ; i <=10 ; i++)
		{
			s.push(i);
		}
	
       
//         System.out.println(s.peek());
//         System.out.println(s.empty());
//         System.out.println(s.search(s));
        
         System.out.println(s);
         System.out.println(s.search(3));
         System.out.println(s.pop());

	}

}
