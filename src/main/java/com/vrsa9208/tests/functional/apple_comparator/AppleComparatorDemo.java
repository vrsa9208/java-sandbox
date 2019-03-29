package com.vrsa9208.tests.functional.apple_comparator;

import static java.util.Comparator.comparing;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AppleComparatorDemo {

	public static void main(String[] args) {
		List<Apple> apples = new LinkedList<>();
		apples.add(new Apple(3.0));
		apples.add(new Apple(7.0));
		apples.add(new Apple(2.0));
		apples.add(new Apple(1.0));
		apples.add(new Apple(8.0));
		
		//Order using an anonymous class
		apples.sort(new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight().compareTo(o2.getWeight());
			}
		});
		
		//Order using a lambda expression
		apples.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
		
		//Order using a function interface with lambda expression
		apples.sort(comparing( a -> a.getWeight()));
		
		//Order using method reference
		apples.sort(comparing(Apple::getWeight));
		
		System.out.println(apples);
	}
}
