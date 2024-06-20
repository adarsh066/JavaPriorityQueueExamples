package com.yourname.priorityqueue;

import java.util.AbstractQueue;
import java.util.PriorityQueue;

public class AbstractQueueExample {
	public static void runExample() {
		AbstractQueue<Integer> aq = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority

		aq.add(1);
		aq.add(5);
		aq.add(3);

		System.out.println("AbstractQueue - Highest priority element: " + aq.peek()); // Peek does not remove the
																						// element
		System.out.println("AbstractQueue - Removing highest priority element: " + aq.poll()); // Poll removes the
																								// element
	}
}
