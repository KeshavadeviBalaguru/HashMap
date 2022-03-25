package com.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hob=new HashMap<Integer, String>();
		hob.put(1, "Abinaya");
		hob.put(2, "Priya");
		hob.put(3, "Keerthana");
		System.out.println(hob);
		
		
		System.out.println("  ");
		for(Map.Entry<Integer, String> m:hob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
