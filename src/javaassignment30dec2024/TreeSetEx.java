package javaassignment30dec2024;
//check following:

import java.util.Iterator;

//Maintain insertion order
//Duplicate allowed
//Null allowed
//Create
//Read
//Update
//Delete

import java.util.TreeSet;

public class TreeSetEx {
	TreeSet<String> treeSet = new TreeSet<>();
	TreeSet<String> treeSett = new TreeSet<>();
	
	public void treeSetFunctions() {
		// create--> no insertion order but sorted order in asc
		treeSet.add("John");
		treeSet.add("Mike");
		treeSet.add("Kate");
		// treeSet.add(null); //not allowed becz its Tree , it cant sort
		// null-->java.lang.NullPointerException
		treeSet.add("mike"); // uppercase first then lower case
		treeSet.add("David");
		treeSet.add("Peter");
		treeSet.add("peter");
		treeSet.add("Mike"); // no duplicates allowed becz its a Set
		//// treeSett.addFirst("Joe"); //Becz its tree -sort
		//// treeSett.addLast("Shawn"); //Becz its tree -sort
		treeSet.addAll(treeSett);

		System.out.println("print treeSet: " + treeSet);

		// read-- iterator
		System.out.println("Get first ele : " + treeSet.getFirst());
		System.out.println("Get last ele : " + treeSet.getLast());

		System.out.println("Read treeSet using iterator: ");
		Iterator<String> iterator = treeSet.iterator();

		while (iterator.hasNext()) { // returns boolean if iteration has more ele

			System.out.println(iterator.next()); // returns next ele in iteration

		}

		// read using for each loop
		System.out.println("Read using for each loop: ");
		for (String data : treeSet) {
			System.out.println(data);
		}

		// update--> no update allowed only remove and add

		// delete --> remove()
		treeSet.remove("Mike");
		treeSet.removeFirst();
		treeSet.removeLast();
		System.out.println("After removing: " + treeSet);
		treeSet.removeAll(treeSett);
		System.out.println("After removing treeSett: " + treeSet);
////	treeSet.removeIf("");

		Object clonedTreeSet = treeSet.clone();
		System.out.println("clonedTreeSet: " + clonedTreeSet);
		System.out.println("Size of treeSet: " + treeSet.size());
		System.out.println("reversed treeSet: " + treeSet.reversed());
		System.out.println("is treeSet equals clonedTreeSet? " + treeSet.equals(clonedTreeSet));
		System.out.println("does treeSet Contains 'mike'?" + treeSet.contains("mike"));
		System.out.println("does treeSet Contains treeSett?" + treeSet.containsAll(treeSett));

		System.out.println("subSet: " + treeSet.subSet("Kate", "Peter")); // returns portion of treeSet: fromEle
																			// inclusive, toEle exclusive
		System.out.println("with boolean subSet: " + treeSet.subSet("Kate", true, "Peter", true)); // returns portion of
																									// treeSet: fromEle
																									// inclusive if
																									// true, toEle
																									// inclusive if true

		System.out.println("tailSet: " + treeSet.tailSet("Kate")); // returns portion of treeSet: from Ele inclusive
		System.out.println("boolean tailSet: " + treeSet.tailSet("Kate", treeSet.contains("peter"))); // returns portion
																										// of treeSet:
																										// fromEle
																										// exclusive if
																										// false

		System.out.println("headSet: " + treeSet.headSet("Peter")); // returns portion of treeSet: all ele strictly
																	// lesser than toEle exclusive
		System.out.println("boolean headSet: " + treeSet.headSet("Peter", true)); // returns portion of treeSet: all ele
																					// strictly lesser than toEle
																					// inclusive if true

		System.out.println("first lowest ele in the set: " + treeSet.first());
		System.out.println("last highest ele in the set: " + treeSet.last());
		System.out.println(treeSet.lower("mike"));// highest ele but strictly less than given ele
		System.out.println(treeSet.floor("mike"));// highest ele but less or equal to the given ele
		System.out.println(treeSet.ceiling("mike")); // least element in this set greater than or equal to the given
														// element
		System.out.println(treeSet.higher("mike")); // least element in this set strictly greater than the given element
													// if nothing then null

		System.out.println("reversed treeSet: " + treeSet.reversed());
		System.out.println("treeSet dec : " + treeSet.descendingSet());

		treeSet.clear();
		System.out.println("is treeSet Empty?" + treeSet.isEmpty());

	}

	public static void main(String[] args) {

		TreeSetEx ts = new TreeSetEx();
		ts.treeSetFunctions();

	}

}
