package com.arrays;

class Th implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("child thread");
		}
	}
}

public class Test1 {

	public static void main(String[] args) {

		Runnable r = new Th();
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main");
		}
	}
}
