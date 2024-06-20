package com.yourname.priorityqueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.PriorityQueue;

public class LinkedTransferQueueExample {
	public static void runExample() {
		LinkedTransferQueue<Integer> ltq = new LinkedTransferQueue<>();

		ltq.add(1);
		ltq.add(5);
		ltq.add(3);

		PriorityQueue<Integer> tempQueue = new PriorityQueue<>((a, b) -> b - a); // Max-Heap for highest priority
		tempQueue.addAll(ltq);

		System.out.println("LinkedTransferQueue - Highest priority element: " + tempQueue.peek()); // Peek does not
																									// remove the
																									// element
		System.out.println("LinkedTransferQueue - Removing highest priority element: " + tempQueue.poll()); // Poll
																											// removes
																											// the
																											// element
	}
}
