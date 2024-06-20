package com.yourname.priorityqueue;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Priority Queue Manager Application");
		BlockingQueueExample.runExample();
		AbstractQueueExample.runExample();
		PriorityQueueExample.runExample();
		PriorityBlockingQueueExample.runExample();
		ConcurrentLinkedQueueExample.runExample();
		ArrayBlockingQueueExample.runExample();
		DelayQueueExample.runExample();
		LinkedBlockingQueueExample.runExample();
		LinkedTransferQueueExample.runExample();
	}
}
//Blocking Queue Interface
//AbstractQueue Class
//PriorityQueue Class
//PriorityBlockingQueue Class
//ConcurrentLinkedQueue Class
//ArrayBlockingQueue Class
//DelayQueue Class
//LinkedBlockingQueue Class
//LinkedTransferQueue