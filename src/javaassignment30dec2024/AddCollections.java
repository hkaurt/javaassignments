package javaassignment30dec2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class AddCollections {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(55);
		treeSet.add(60);

		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(45);
		hashSet.add(40);

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(50);

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(6);

		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(10);
		linkedlist.add(20);

		treeSet.addAll(hashSet);
		treeSet.addAll(linkedHashSet);
		treeSet.addAll(linkedlist);
		treeSet.addAll(arrayList);
		System.out.println(treeSet);

		hashSet.addAll(treeSet);
		hashSet.addAll(linkedHashSet);
		hashSet.addAll(linkedlist);
		hashSet.addAll(arrayList);
		System.out.println(hashSet);

		linkedHashSet.addAll(treeSet);
		linkedHashSet.addAll(hashSet);
		linkedHashSet.addAll(linkedlist);
		linkedHashSet.addAll(arrayList);
		System.out.println(linkedHashSet);

		linkedlist.addAll(treeSet);
		//linkedlist.addAll(3, treeSet);
		linkedlist.addAll(hashSet);
		linkedlist.addAll(linkedHashSet);
		linkedlist.addAll(arrayList);
		System.out.println(linkedlist);
		
		arrayList.addAll(treeSet);  
		//arrayList.addAll(3, treeSet);
		arrayList.addAll(hashSet);
		arrayList.addAll(linkedHashSet);
		arrayList.addAll(linkedlist);
		System.out.println(arrayList);

	}

}
