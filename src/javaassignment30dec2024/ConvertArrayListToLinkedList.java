package javaassignment30dec2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class ConvertArrayListToLinkedList {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(2);
		arraylist.add(6);
		arraylist.add(4);
		arraylist.add(8);
		arraylist.add(40);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(5);
		
		//ArrayList to LinkedList and vice versa  -- will follow insertion order in both
		LinkedList<Integer> linkedlist = new LinkedList<>(arraylist);
		System.out.println("ArrayList to LinkedList" + linkedlist);

		System.out.println(arraylist);
		ArrayList<Integer> convertAl = new ArrayList<>(linkedlist);
		System.out.println("LinkedList to ArrayList:" + convertAl);
		
		//ArrayList to LinkedHashSet And Vice versa  --- will remove duplicates and will follow insertion order
		LinkedHashSet<Integer> set= new LinkedHashSet<>(arraylist);
		System.out.println("ArrayList to LinkedHashSet: "+ set);
		
		ArrayList<Integer> al= new ArrayList<>(set);
		System.out.println("LinkedHashSet to ArrayList: "+ al); 
		
		//ArrayList to TreeSet And Vice versa  ---will sort in asc and remove duplicates
		TreeSet<Integer> ts= new TreeSet<>(arraylist);
		System.out.println("ArrayList to TreeSet: "+ ts);
		
		ArrayList<Integer> alt= new ArrayList<>(ts);
		System.out.println("TreeSet to ArrayList: "+ alt);   // will keep in same order as treeset -- follows insertion order
		
		//ArrayList to HashSet and vice versa  -- removes duplicates, random order
		HashSet<Integer> hs= new HashSet<>(arraylist);
		System.out.println("ArrayList to HashSet: "+ hs);
		
		ArrayList<Integer> all= new ArrayList<>(hs);
		System.out.println("HashSet to ArrayList: "+ all);
		
	}

}
