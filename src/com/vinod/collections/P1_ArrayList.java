package com.vinod.collections;

import java.util.ArrayList;

public class P1_ArrayList {
	public static void main(String[] args) {
		// Insertion Order is preserved
		// Duplicates are allowed
		ArrayList list = new ArrayList();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);
		list.add("B");
		System.out.println("List :: " + list); // [A,10,A,null,B]
		list.remove(2); // [A,10,null,B]
		System.out.println("List after remove operation :: " + list);
		list.add(2, "M");
		list.add("N");
		System.out.println(list); // [A,10,M,null,B,N]
	}
}
