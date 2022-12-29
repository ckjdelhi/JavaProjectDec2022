package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		
//		String []strArr=new String[5];
//		strArr[0] = "A";
//		strArr[1] = "B";
//		System.out.println(strArr);
//	
//		
//		HashSet<String> list=new HashSet<>();
//		list.add("A");
//		list.add("C");
//		list.add("D");
//		list.add("Z");
//		list.add("B");
//		list.add("A");
//		
//		System.out.println(list);
//		System.out.println(list.size());
//		//list.remove(1);
//		System.out.println(list);
//		//Collections.sort(list);
//		//System.out.println(list);
		
		//List Interface
		//ArrayList<Integer> list= new ArrayList<>();//[20, 10, 20, 30, 20, 40]
		//LinkedList<Integer> list= new LinkedList<>();//[20, 10, 20, 30, 20, 40]
//		Vector<Integer> list=new Vector<>();//[20, 10, 20, 30, 20, 40]
//		list.add(20);
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(20);
//		list.add(40);
//		System.out.println(list);
//		
//		//Set Interface
//		//HashSet<Integer> setObj=new HashSet<>();//[20, 40, 10, 30]
//		//LinkedHashSet<Integer> setObj=new LinkedHashSet<>(); //[20, 10, 30, 40]
//		TreeSet<Integer> setObj=new TreeSet<>();//[10, 20, 30, 40]
//		setObj.add(20);
//		setObj.add(10);
//		setObj.add(20);
//		setObj.add(30);
//		setObj.add(20);
//		setObj.add(40);
//		System.out.println(setObj);
		
		Vector<Integer> list=new Vector<>();//[20, 10, 20, 30, 20, 40]
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		System.out.println(list);
		//for, while, do-while, forEach, java8-forEach, iterator-while,for,do-while, List Iterator-while,for,do-while, enumeration-while,for,do-while
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//for each
		for(Integer i: list) {
			System.out.println(i);
		}
		
		//java 8 -forEach
		list.forEach(a -> System.out.println(a));
		
		//Iterator interface to print data
		Iterator<Integer> itr=list.iterator(); // ->forward
		while(itr.hasNext()) {
			//itr.remove();  //fail fast vs fail safe
			list.add(20);
			System.out.println(itr.next());
		}
		
		//Iterator interface to print data
		ListIterator<Integer> listItr=list.listIterator();// <-backward  ->forward
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		Enumeration<Integer> enu= list.elements();
		while(enu.hasMoreElements()) {
			list.add(20);
			System.out.println(enu.nextElement());
			if(list.size()==10)
				break;
		}
		
	}

}
