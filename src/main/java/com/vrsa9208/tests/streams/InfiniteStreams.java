package com.vrsa9208.tests.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		System.out.println("Infinite streams");
		IntStream.iterate(1, n -> n + 1)
			.mapToObj(n -> n + ", ")
			.limit(10)
			.forEach(System.out::print);
		
		System.out.println("\nSecuencia fibonacci");
		
		Stream.iterate(new int[] {0,1}, t -> new int[] {t[1], t[0] + t[1]})
			.map(n -> n[1] + ", ")
			.limit(10)
			.forEach(System.out::print);
		
	}

}
