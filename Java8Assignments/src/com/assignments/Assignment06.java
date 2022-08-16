package com.assignments;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.dayOne.Employee;

public class Assignment06 {
	public static void main(String[] args) {

		Employee06 emp1 = new Employee06("Tom", "Tech Lead");
		Employee06 emp2 = new Employee06("Sam", "developer");
		Employee06 emp3 = new Employee06("Anna", "Trainee");

		ArrayList<Employee06> list = new ArrayList<Employee06>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		
		Predicate<Employee06> predicate = emp -> emp.getRole().equals("developer") ? true : false;

		for (Employee06 emp : list) {
			System.out.println(predicate.test(emp));
		}

	}
}
