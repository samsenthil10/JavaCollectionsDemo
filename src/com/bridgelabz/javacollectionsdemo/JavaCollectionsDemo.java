package com.bridgelabz.javacollectionsdemo;

import java.util.*;

public class JavaCollectionsDemo {

	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();
	}

	public static void doListDemo() {

		List<String> list = new LinkedList<>();

		System.out.println("\nInside List Demo\n");
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void doStackDemo() {

		Stack<String> stack = new Stack<>();

		System.out.println("\nInside Stack Demo\n");
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amrit");
		stack.push("Ashish");
		stack.push("Garima");
		String popped = stack.pop();

		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}



	public static void doQueueDemo() {

		PriorityQueue<String> queue = new PriorityQueue<>();

		System.out.println("\nInside Queue Demo\n");
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("Jai Shankar");
		queue.add("Raj");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("Iterating the queue elements:");

		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements:");
		iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void doSetDemo( ) {

		Set<String> set = new LinkedHashSet<>();

		System.out.println("\nInside Set Demo\n");
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		for(String element: set) {
			System.out.println(element);
		}
	}

	public static void doMapDemo() {

		Map<Integer, String> map = new HashMap<>();

		System.out.println("\nInside Map Demo\n");
		map.put(100, "Amrit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(101, "Surya");

		for(Map.Entry<Integer, String> mapper:map.entrySet()) {
			System.out.println(mapper.getKey()+" "+mapper.getValue());
		}
	}
}
