package com.asthvinayak.thread;

public class ThereadDemo {
	static ThereadDemo t = new ThereadDemo();

	static Thread thread1 = new Thread() {
		public void run() {			
				System.out.println(Thread.currentThread().getName());
			}
			
		};

	static Thread thread2=new Thread(){public void run(){t.m();System.out.println(Thread.currentThread().getName());}};

	void m() {
		System.out.println("m" + Thread.currentThread().getName());
	}

	public static void main(String... k) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		thread1.start();
		thread2.start();
	}

}
