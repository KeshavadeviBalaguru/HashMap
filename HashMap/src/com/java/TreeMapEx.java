package com.java;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> hob=new TreeMap<Integer, String>();
		hob.put(3, "Zibra");
		hob.put(4, "Horse");
		hob.put(2, "Cat");
		hob.put(1, "Ant");
		System.out.println(hob);
		System.out.println("");
		for(Map.Entry<Integer, String> m:hob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
