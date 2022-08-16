package com.dayOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class EmpSortByAge {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Tom", 25);
		Employee emp2 = new Employee(2, "Sam", 22);
		Employee emp3 = new Employee(2, "Anna", 28);

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("list Before sorting : \n" + list);

//      Collections.sort(list,Comparator.comparing(Employee::getEmpAge));

		// Classroom Assignment
		Collections.sort(list,
				(o1, o2) -> (o1.getEmpAge() < o2.getEmpAge()) ? -1 : (o1.getEmpAge() > o2.getEmpAge()) ? +1 : 0);

		System.out.println("list after sorting by age: ");

		for (Employee emp : list) {
			System.out.println(emp.toString());
		}

		// Assignment 2
		Collections.sort(list, (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));

		System.out.println("list after sorting by employee name: ");

		for (Employee emp : list) {
			System.out.println(emp.toString());
		}

		//Classroom Assignment
		Consumer<Employee> consumer = e -> System.out
				.println(e.getEmpID() + " " + e.getEmpName() + " " + e.getEmpAge());
	}
}
