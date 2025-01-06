package javaassignment30dec2024;
//check following:

//Maintain insertion order
//Duplicate allowed
//Null allowed
//Create
//Read
//Update
//Delete

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	HashSet<String> hashSet = new HashSet<>();
	HashSet<String> hashSett = new HashSet<>();

	public void HashSetFunctions() {

		// CREATE --put()--> no insertion order
		hashSet.add("John");
		hashSet.add("Delta");
		hashSet.add(null); // null allowed
		hashSet.add(null); // null duplication not allowed
		hashSet.add("Steve");
		hashSet.add("Mike"); // duplication not allowed
		hashSet.add("Delta");

		hashSett.add("John");
		hashSett.add("Delta");
		hashSett.add(null); // null allowed
		hashSett.add(null); // null duplication not allowed
		hashSett.add("Steve");
		hashSett.add("Mike"); // duplication not allowed
		hashSett.add("Delta");
		System.out.println("Print hashSet: " + hashSet);

//	System.out.println(hashSet.containsAll(hashSett));
//	System.out.println(hashSet.equals(hashSett));

		// READ--by iterator
		Iterator<String> iterator = hashSet.iterator(); // iterator - interface, iterator method which returns me an
														// iterator of interface iterator
		System.out.println("hashSet using iterator: ");
		while (iterator.hasNext()) { // returns true if iterator has more elements

			System.out.println(iterator.next());

		}

		// use for loop : //if comparison- through NullPointerException if null ele is
		// in set
		System.out.println("hashSet using for each loop: ");
		for (String data : hashSet) {
			System.out.println(data);
		}

//	//UPDATE --replace(ele)-- no replace method , only remove and add allowed

		// DELETE --remove(ele)
		hashSet.remove("John"); // remove
		hashSet.remove(null);
//	hashSet.removeAll(hashSet);   //removes all 
		System.out.println(hashSet);

////	hashSet.spliterator();
////	hashSet.forEach(null);
		System.out.println(hashSet.size());
		Object cloneHashSet = hashSet.clone();
		System.out.println("clone of hashSet: " + cloneHashSet);
		System.out.println("Does hashSett contains hashSet? " + hashSett.containsAll(hashSet));
		System.out.println("Is hashSet equals cloneHashSet? " + hashSet.equals(cloneHashSet));
		System.out.println("Is Doe present in hashSet? " + hashSet.contains("Doe"));
		System.out.println(hashSet.toString()); // returns string

		hashSet.clear(); // clears all
		System.out.println(hashSet);
		System.out.println(hashSet.isEmpty());

	}

	public static void main(String[] args) {

		HashSetEx hm = new HashSetEx();
		hm.HashSetFunctions();

	}

}