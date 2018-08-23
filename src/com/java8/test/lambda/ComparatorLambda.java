package com.java8.test.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.java.test.Developer;

public class ComparatorLambda {

	public static void main(String s[]) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		listDevs.forEach((developer) -> System.out
				.println(developer.getName() + ", " + developer.getSalary() + ", " + developer.getAge()));

		// Sort with name
		listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));
		
		System.out.println("After Sort");
		listDevs.forEach((developer) -> System.out
				.println(developer.getName() + ", " + developer.getSalary() + ", " + developer.getAge()));

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
