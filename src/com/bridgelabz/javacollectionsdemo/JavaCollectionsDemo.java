package com.bridgelabz.javacollectionsdemo;

import java.util.*;

public class JavaCollectionsDemo {
	
	public static void main(String[] args) {
		
		doListDemo();
	}
	
	public static void doListDemo() {
		
		List<String> list = new LinkedList<>();
		
		System.out.println("Inside List Demo");
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
