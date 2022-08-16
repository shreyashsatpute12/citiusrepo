package com.assignments;

public class Assignment03ThreadClass {
	public static void main(String[] args) {
		Runnable thread = () -> System.out.println("Thread by using lambda expression. ");

		Thread t = new Thread(thread);
		t.start();
	}
}
