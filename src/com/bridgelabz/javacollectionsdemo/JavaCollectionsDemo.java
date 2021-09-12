package com.bridgelabz.javacollectionsdemo;

import java.util.*;

public class JavaCollectionsDemo {

	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
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
}
