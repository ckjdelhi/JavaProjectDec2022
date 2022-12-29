package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap<String, String> map=new HashMap<>();
		//LinkedHashMap<String, String> map=new LinkedHashMap<>();
		//TreeMap<String, String> map=new TreeMap<>();
		Hashtable<String, String> map= new Hashtable<>();
		map.put("India", "Delhi");
		map.put("Nepal", "kathmandu");
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map.get("Nepal"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		//System.out.println(map.elements());
		
		
		for(String key: map.keySet()) {
			System.out.println(key +" "+ map.get(key));
		}
		
		for(Entry<String, String> entry :map.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}

}
