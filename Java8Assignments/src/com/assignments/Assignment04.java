package com.assignments;

public class Assignment04 implements Interf01, Interf02, Interf03 {

	public static void main(String[] args) {

		Assignment04 assignment04 = new Assignment04();
		assignment04.sum(3, 7);

	}

	@Override
	public void sum(int a, int b) {
		System.out.println("child class implementation=" + (a + b));
	}

}
