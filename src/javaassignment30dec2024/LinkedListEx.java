package javaassignment30dec2024;

import java.util.Collections;
import java.util.LinkedList;

//check following:
//Maintain insertion order
//Duplicate allowed
//Null allowed
//Create
//Read
//Update
//Delete

public class LinkedListEx {

	LinkedList<Integer> listNumbers = new LinkedList<>();

	public void linkedListFunctions() {
		// Creation -- follows insertion order
		listNumbers.add(10);
		listNumbers.add(20);
		listNumbers.add(50);
		listNumbers.add(40);
		listNumbers.add(30);
		listNumbers.add(80);
		listNumbers.add(40);
		listNumbers.add(20);

		System.out.println(listNumbers);

		// READ --get()
		System.out.println(listNumbers.get(5));

		// Update--set()-- accepts null, allows duplicates
		listNumbers.set(4, null);
		System.out.println(listNumbers);

		// delete -- remove()
		listNumbers.remove(); // removes index 0 by default
		System.out.println(listNumbers);
		listNumbers.remove(3);
		System.out.println(listNumbers);

		listNumbers.remove(Integer.valueOf(40));
		System.out.println(listNumbers);

		// Iterate over the LinkedList using a for-each loop
		System.out.print("Iterating over the LinkedList: ");
		for (Integer listNum : listNumbers) {
			System.out.print(listNum + " ");
		}

		Collections.sort(listNumbers); // Sort in ascending order // cant be sorted if contains null throws-
										// NullPointerException
		System.out.println("LinkedList after sorting in asc order: " + listNumbers);

		// descending order
		System.out.println("LinkedList after sorting in desc order: " + listNumbers.reversed()); // reverse the
																									// ArrayList

		listNumbers.clear(); // clear- Removes all elements
		System.out.println("LinkedList after clearing: " + listNumbers);

		System.out.println("Is the LinkedList empty? " + listNumbers.isEmpty()); // check if ArrayList is Empty

	}

	public static void main(String[] args) {

		LinkedListEx ll = new LinkedListEx();

		ll.linkedListFunctions();

	}

}
