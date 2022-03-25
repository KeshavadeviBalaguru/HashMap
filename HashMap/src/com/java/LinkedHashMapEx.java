package com.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hob=new LinkedHashMap<Integer, String>();
		hob.put(101, "Krishna");
		hob.put(102, "Siva");
		hob.put(103, "Maruthi");
		System.out.println(hob);
		System.out.println(" ");
		for(Map.Entry<Integer,String> m:hob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
