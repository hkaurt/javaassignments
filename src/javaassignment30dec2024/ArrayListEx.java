package javaassignment30dec2024;

import java.util.ArrayList;
import java.util.Collections;

//check following:
//Maintain insertion order
//Duplicate allowed
//Null allowed
//Create
//Read
//Update
//Delete

public class ArrayListEx {

	ArrayList<Integer> numbers = new ArrayList<>();

	public void arrayListFunctions() {

		//CRUD:
		// CREATE -add()-- Maintains insertion order
		numbers.add(2);
		numbers.add(6);
		numbers.add(4);
		numbers.add(8);
		numbers.add(40);
		numbers.add(30);
		numbers.add(40);
		numbers.add(5);

		System.out.println("ArrayList after adding elements: " + numbers); // can be printed directly while in array

//		numbers.add(5, 0);    // insert 0 at index 5 in ArrayList numbers
//		System.out.println(numbers);
//		numbers.addAll(numbers); // insert ArrayList numbers at the end
//		System.out.println(numbers);  
//		numbers.addAll(2, numbers);	// insert ArrayList numbers at index 2
//		System.out.println(numbers);

		// READ -get(index);
		System.out.println(" ele at index 1: " + numbers.get(1)); // get ele at index 1--'4'
		System.out.println("First ele of ArrayList: " + numbers.getFirst()); // provides index 0 element
		System.out.println("Last ele of ArrayList:" + numbers.getLast()); // provides last ele in arrayList

		// UPDATE -set(index, ele)
		numbers.set(2, null); // can accept null, duplicate ele
		numbers.set(1, null);
		numbers.set(3, 0);

		// -- returns ele previously at specifed location
		System.out.println("ArrayList after updating elements at index 2 and 1: " + numbers);

		// DELETE -remove(index or ele);
		
		numbers.remove(2); // remove by index
		numbers.remove(null);
		System.out.println("ArrayList after removing element at index 2 and value null: " + numbers);

		numbers.remove(Integer.valueOf(40)); // remove by value, if duplicated then removes first one
		System.out.println("ArrayList after removing element 40: " + numbers);

		System.out.println("Size of ArrayList: " + numbers.size()); // Size of ArrayList
		System.out.println("index of ele 5: " + numbers.indexOf(5)); // find index of ele
		System.out.println("Does the ArrayList contain 2? " + numbers.contains(2)); // Check if an element exists

		// Iterate over the ArrayList using a for-each loop
		System.out.print("Iterating over the ArrayList: ");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

		Collections.sort(numbers); // Sort in ascending order // cant be sorted if contains null throws-
									// NullPointerException
		System.out.println("ArrayList after sorting in asc order: " + numbers);

		// descending order
		System.out.println("ArrayList after sorting in desc order: " + numbers.reversed()); // reverse the ArrayList

		numbers.clear(); // clear- Removes all elements
		System.out.println("ArrayList after clearing: " + numbers);

		System.out.println("Is the ArrayList empty? " + numbers.isEmpty()); // check if ArrayList is Empty

	}

	public static void main(String[] args) {

		ArrayListEx al = new ArrayListEx();
		al.arrayListFunctions();

	}

}
