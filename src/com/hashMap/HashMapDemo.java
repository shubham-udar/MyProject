package com.hashMap;

import java.util.HashMap;



public class HashMapDemo {

		public static void main(String[] args)
		{
			HashMap<Integer,String> map = new HashMap<>();
			map.put(1,"Shubham");
			map.put(2, "Sahil");
			map.put(3, "Omkar");
			map.put(3, "Jayram");
			
			System.out.println(map);
			
		String student = map.get(3);
		
		System.out.println(student);
			
		}
}
