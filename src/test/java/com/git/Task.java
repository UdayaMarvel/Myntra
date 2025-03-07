package com.git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task {
	public static void main(String[] args) {
		
		List<Integer> a =new ArrayList<>();
		a.add(5660);
		a.add(98);
		a.add(512);
		a.add(512);
		a.add(5484);
		
		int size = a.size();
		System.out.println(size);
		
		System.out.println(a);
		
		Object object = a.get(3);
		System.out.println(object);
		
		a.add(0,153);
		System.out.println(a);
		
		a.set(3, 996);
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println("Sorted order is "+a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		Collections.reverse(a);
		System.out.println("Reversed order is "+a);
		
		int indexOf = a.indexOf(512);
		System.out.println("Index of 512 is "+indexOf);
		
		int lastIndexOf = a.lastIndexOf(512);
		System.out.println("Last index of 512 is "+lastIndexOf);
		
		boolean contains = a.contains(98);
		System.out.println(contains);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		Object remove = a.remove(2);
		System.out.println(a);
		System.out.println("Removed value is "+remove);
		

		List a1 = new ArrayList();
		a1.addAll(a);
		System.out.println(a1);
		a1.add(52345);
		System.out.println(a1);
		
		a1.removeAll(a);
		System.out.println(a1);
		
		a1.retainAll(a);
		System.out.println(a);
		
		Iterator<Integer> iterator = a.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<Integer> listIterator = a.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		}
}
