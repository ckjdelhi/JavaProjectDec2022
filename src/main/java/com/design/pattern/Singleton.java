package com.design.pattern;

/*
 * Rules for Singleton (Eager/Early Loading)
 * 1. make constructor as private
 * 2. create private static object of Singleton class
 * 3. create public static method and return the object
 */
/*public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() {
		return instance;
	}
}*/
/*
 * Rules for Singleton (Lazy/Late Loading)
 * 1. make constructor as private
 * 2. create private static object of Singleton class and assign null value
 * 3. create public static method and check if object is null then return object
 */
public class Singleton {
	private static Singleton instance = null;
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}
