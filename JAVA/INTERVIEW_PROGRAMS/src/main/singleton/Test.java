package com.asthvinayak.singleton;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException   {
		
		Singleton singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
		Singleton singleton2=Singleton.getInstance();
		System.out.println(singleton2.hashCode());
		
		Singleton singleton3=(Singleton)singleton2.clone();
		System.out.println(singleton3.hashCode());
	}

}
