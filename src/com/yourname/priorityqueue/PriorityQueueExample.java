package com.yourname.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void runExample() {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority

		pq.add(1);
		pq.add(5);
		pq.add(3);

		System.out.println("PriorityQueue - Highest priority element: " + pq.peek()); // Peek does not remove the
																						// element
		System.out.println("PriorityQueue - Removing highest priority element: " + pq.poll()); // Poll removes the
																								// element
	}
}
