package com.oops.encapsulation;

/*
 * Access Modifiers:
 * 1. public: can be accessible anywhere
 * 2. private: can be accessible within the same class only
 * 3. protected: can be accessible within the same package all classes 
  				 and outside of package using inheritance
 * 4. default: can be accessible within the same package all classes
 */
public class AccessModifiersDemo {
	
	public int pubA = 5;
	private int priB = 5;
	        int defC = 5;
	protected int proD = 5;
	
	public static void main(String[] args) {
		
	}
	void show() {
		System.out.println(pubA);
		System.out.println(priB);
		System.out.println(defC);
		System.out.println(proD);
	}
}
