package com.java.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	public static void main(String s[]) {
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getName()+", "+developer.getSalary()+", "+developer.getAge());
		}
		
		// sort by age (using primitive value)
		Collections.sort(listDevs, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		
		});
		
		System.out.println("After age Sort........................");
		for (Developer developer : listDevs) {
			System.out.println(developer.getName()+", "+developer.getSalary()+", "+developer.getAge());
		}
		
		// sort by name (using object)
		Collections.sort(listDevs, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				// TODO Auto-generated method stub
				return o1.getSalary().compareTo(o2.getSalary());
			}
		
		});
		
		System.out.println("After salary Sort.......................");
		for (Developer developer : listDevs) {
			System.out.println(developer.getName()+", "+developer.getSalary()+", "+developer.getAge());
		}
	}
	
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}

}
