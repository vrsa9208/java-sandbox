package com.vrsa9208.tests.streams;

public class ParallelStreams {

	public static void main(String[] args) {
		System.out.println("Parallel streams");
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println("Available processors: " + availableProcessors);
	}
}
