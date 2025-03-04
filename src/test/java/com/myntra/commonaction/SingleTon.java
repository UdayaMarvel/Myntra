package com.myntra.commonaction;

public class SingleTon {

	public static SingleTon s = null;
	
	public static SingleTon getInstance() {
		if(s==null) {
			s = new SingleTon();
		}
		return s;
	}
	
	
	private SingleTon() {
		
	}
	public static void main(String[] args) {
		SingleTon x = getInstance();
		System.out.println(x);
		SingleTon x1 = getInstance();
		System.out.println(x1);
		SingleTon s1 = new SingleTon();
		System.out.println(s1);
		SingleTon s2 = new SingleTon();
		System.out.println(s2);
		
	}
	
}
