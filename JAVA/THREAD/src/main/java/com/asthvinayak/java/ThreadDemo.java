package com.asthvinayak.java;

public class ThreadDemo {

	static EvenOdd evenOdd = new EvenOdd(); // servlet

	static Thread thread1 = new Thread() { // server based on request

		public void run() {
			try {
				evenOdd.printEven(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	};

	static Thread thread2 = new Thread() {
		public void run() {
			try {
				evenOdd.printOdd(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	};

	static class EvenOdd {

		boolean b;
		void printEven(int i) throws InterruptedException {
			synchronized (evenOdd) {
				if(b) 
				evenOdd.wait();
				System.out.println(i);
				evenOdd.notify();			
				
			}
		}

		void printOdd(int j) throws InterruptedException {
			synchronized (evenOdd) {
				
				if(b) 
				evenOdd.wait();
				System.out.println(j);
				evenOdd.notify();
				
			}
		}

	}

	public static void main(String... k) {
		thread1.start();
		thread2.start();
	}

}
