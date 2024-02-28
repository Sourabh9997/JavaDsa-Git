package com.java.Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.BinaryOperator;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Sourabh", 5000, 28, "Cse", "M", "Active", 2000);
		Employee emp2 = new Employee(2, "Niks", 10000, 26, "Logistics", "F", "Active", 1995);
		Employee emp3 = new Employee(3, "Rahul", 18882, 29, "Cse", "M", "Inactive", 2021);
		Employee emp4 = new Employee(4, "Mannu", 10000, 27, "Hotel", "M", "Active", 2022);
		Employee emp5 = new Employee(5, "Mom", 60000, 48, "HouseWife", "F", "Active", 1974);
		Employee emp6 = new Employee(6, "Sourabh", 20000, 60, "BSF", "M", "Active", 1989);

		List<Employee> list = new ArrayList<Employee>();

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		// Operations

		// Male and Female counting by GroupingBy

		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);

		// Name of all departments

		Set<String> set = list.stream().map(e -> e.getDept()).collect(Collectors.toSet());
		System.out.println("Dept names are : " + set);
		System.out.println("**************************************************************************");
//Duplicates Names 
		
		Map<String, Long> dup = list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		System.out.println("Duplicates name " + dup);

		System.out.println("**************************************************************************");
		
		
		
		// Employee details based on dept

		Map<String, List<Employee>> mapp = list.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
		mapp.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});

		System.out.println("**************************************************************************");

		// Employee count working in a Department

		Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println("Employee count working in a Department : " + map2);

		// Active members

		long count = list.stream().filter(e -> "Active".equals(e.getStatus())).count();
		System.out.println("Active members are : " + count);

		// MAx salary
		Employee obj = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(" Sabse jyada kamane wala " + obj);

		System.out.println("**************************************************************************");

		Map<String, Optional<Employee>> obj2 = list.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		System.out.println("Higest salary from each dept " + obj2);

		System.out.println("**************************************************************************");
		System.out.println("**************************************************************************");
		System.out.println("**************************************************************************");

		// Average age

		Map<String, Double> age = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(age);

		// Date of Joining

		List<String> name = list.stream().filter(e -> e.getDOJ() > 2000).map(Employee::getName).toList();
		System.out.println(name);

		// Most Experienced banda

		Optional<Employee> name1 = list.stream().sorted(Comparator.comparingInt(Employee::getDOJ)).findFirst();
		System.out.println(name1);

		String input = "My name is nitin and i can speak malyalam";
		System.out.println(input);
		String[] words = input.split(" ");
		System.out.println(Arrays.toString(words));
// Sorting in descending order of their salaries
		System.out.println("Sorting in descending order of their salaries");
		List<Employee> newlist = list.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(newlist);
		System.out.println("Important operation ************************************************");
		List<Employee> haha = list.stream().map(e -> {
			if (e.getAge() > 48) {
				e.setSalary(e.getSalary() * 2);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(haha);

	}

}
