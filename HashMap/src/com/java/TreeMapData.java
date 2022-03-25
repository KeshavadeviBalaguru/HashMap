package com.java;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapData {

	public static void main(String[] args) {
		TreeMap<Long, String> eob=new TreeMap<Long, String>();
		eob.put(9876543678l, "Kowsic");
		eob.put(7651234567l, "Priya");
		eob.put(9087346732l, "Lakshmi");
		eob.put(6754328920l, "Karthir");
		eob.put(9982634773l, "Divya");
		eob.put(6493827267l, "Praven");
		eob.put(1384793902l, "Subi");
		eob.put(7827392777l, "Anushiya");
		eob.put(9327765552l, "Abinaya");
		eob.put(7294758686l, "Akshaya");
		System.out.println(eob);
		for(Map.Entry<Long, String> m:eob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
