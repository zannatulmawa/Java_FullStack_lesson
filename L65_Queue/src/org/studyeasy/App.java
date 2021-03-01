package org.studyeasy;

import java.util.Queue;
import java.util.Deque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class App {

	public static void main(String[] args) {
		
		/*
		Queue <Integer> queue = new ArrayBlockingQueue<>(6); //A collection designed for holding elements prior to processing
		try {
			queue.add(1);
			queue.add(8);
			queue.add(6);
			queue.add(4);
			queue.add(3);
			queue.add(10);
			queue.add(9);
		} catch (IllegalStateException e) {
			System.out.println("Queue is full");
		}
		
		for (Integer member: queue) {
			System.out.println(member);
		} */
		
		
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		
		
			deque.offer(1);
			deque.offer(2);
			deque.offer(3);
			deque.offer(4);
			deque.offer(5);
			
			for (Integer numbers: deque) {
				System.out.println(numbers);
			}
			
			System.out.println("************");
			deque.addFirst(0);
			deque.removeLast();
			
			for (Integer numbers: deque) {
				System.out.println(numbers);
			}

	}

}
