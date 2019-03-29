package com.vrsa9208.tests.method_references;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencesDemo {

	public static void main(String[] args) {
		Map<String, Supplier<Fruit>> fruitSupplier = new HashMap<>();
		
		fruitSupplier.put("Apple", Apple::new);
		fruitSupplier.put("Orange", Orange::new);
		fruitSupplier.put("Pineapple", Pineapple::new);
		
		System.out.println(fruitSupplier.get("Apple").get().getDescription());
		System.out.println(fruitSupplier.get("Apple").get().getDescription());
		System.out.println(fruitSupplier.get("Orange").get().getDescription());
		System.out.println(fruitSupplier.get("Pineapple").get().getDescription());
		
		Consumer<Fruit> fruitConsumer = MethodReferencesDemo::prepare;
		
		fruitConsumer.accept(fruitSupplier.get("Apple").get());
		fruitConsumer.accept(fruitSupplier.get("Pineapple").get());
	}
	
	public static void prepare(Fruit fruit) {
		System.out.println("Preparing a delicious " + fruit.getName() + " cocktail");
	}
}
