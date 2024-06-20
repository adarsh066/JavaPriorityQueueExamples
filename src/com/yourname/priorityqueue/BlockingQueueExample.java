package com.yourname.priorityqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.PriorityQueue;

public class BlockingQueueExample {
	public static void runExample() {
		// Create a temporary PriorityQueue with the custom comparator
		PriorityQueue<Integer> tempQueue = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority

		// Create the PriorityBlockingQueue and add elements
		BlockingQueue<Integer> bq = new PriorityBlockingQueue<>(tempQueue);

		bq.add(1);
		bq.add(5);
		bq.add(3);

		try {
			System.out.println("BlockingQueue - Highest priority element: " + bq.peek()); // Peek does not remove the
																							// element
			System.out.println("BlockingQueue - Removing highest priority element: " + bq.take()); // Take removes the
																									// element
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
