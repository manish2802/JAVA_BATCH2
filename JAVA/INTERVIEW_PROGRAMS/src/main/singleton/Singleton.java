package com.asthvinayak.singleton;

public class Singleton implements Cloneable {

	public static Singleton SINGLETON;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (SINGLETON == null) {
			SINGLETON = new Singleton();
			return SINGLETON;
		}
		return SINGLETON;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw  new CloneNotSupportedException();
	}

}
