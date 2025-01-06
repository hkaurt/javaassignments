package javaassignment30dec2024;

import java.util.HashMap;
import java.util.TreeMap;

//check following:
//Maintain insertion order
//Duplicate allowed
//Null allowed
//Create
//Read
//Update
//Delete
public class TreeMapEx {

	TreeMap<Integer, String> treeMap = new TreeMap<>();
	TreeMap<Integer, String> treeMapp = new TreeMap<>();
	HashMap<Integer, String> hashMap = new HashMap<>();

	public void treeMapFunctions() {

		// create--> put()-->no insertion order but sorted key order in asc
		treeMap.put(5, "John");
		treeMap.put(7, "Kate");
		treeMap.put(1, null); // duplicate values allowed
		treeMap.put(6, null);// null allowed for value only
		treeMap.put(3, "Ron"); // duplicate keys not allowed
		treeMap.put(3, "David");
		treeMap.put(4, "Peter");
		treeMap.put(2, "Mike");
		treeMap.put(9, "Rose");
		treeMap.put(8, "Ray");
		// treeMap.put(null, null); //throws java.lang.NullPointerException if key is
		// null, not allowed
		treeMapp.put(10, "joe");
		treeMap.putAll(treeMapp);

		hashMap.put(5, "George");
		hashMap.put(12, "Kim");
		
		// putAll() used to add Map collection
		hashMap.putAll(treeMap);   
		treeMap.putAll(hashMap);

		System.out.println("print hashMap: "+ hashMap);
		System.out.println("print treeMap: " + treeMap);

		// read--> get(key)
		System.out.println(treeMap.get(5));

		// update--> replace(key,new value)
		treeMap.replace(10, "Rive");
		System.out.println("Print after replacing key 10 value: " + treeMap);
		treeMap.replace(10, "Rive", "Ron");
		System.out.println("print after replacing Rive with Ron: " + treeMap);
//		treeMap.replaceAll();

		// delete--> remove(key)
		treeMap.remove(5);
		treeMap.remove(5, "John");
		System.out.println("after removing key 5: " + treeMap);

		Object clonedTreeMap = treeMap.clone();
		System.out.println("clonedTreeMap: " + clonedTreeMap);
		System.out.println("is treeMap equals clonedTreeMap? " + treeMap.equals(clonedTreeMap));
		System.out.println("does treeMap contains 'Mike'" + treeMap.containsValue("Mike"));
		System.out.println("does treeMap contains key '2'" + treeMap.containsKey(2));

		System.out.println("subMap: " + treeMap.subMap(6, 8)); // returns treeMap : fromKey inclusive, toKey exclusive
		System.out.println("subMap boolean: " + treeMap.subMap(6, false, 8, true)); // fromKey, boolean inclusive,
																					// toKey, boolean inclusive if false
																					// exclusive

		System.out.println("print tailMap from Key 4" + treeMap.tailMap(4)); // returns portion of this map with keys
																				// greater than fromele including
																				// fromkey
		System.out.println("print tailMap from Key 4 excluding key 4: " + treeMap.tailMap(4, false)); // if false then
																										// fromKey
																										// exclusive
		System.out.println("print headMap from Key 4 excluding key 4: " + treeMap.headMap(4)); // keys less than toKey
																								// exclusive
		System.out.println("print headMap from Key 4 excluding key 4: " + treeMap.headMap(4, true)); // keys less than
																										// toKey
																										// inclusive if
																										// true

		treeMap.headMap(4);
		System.out.println("size : " + treeMap.size());
		System.out.println("in string format: " + treeMap.toString());
		treeMap.clear();
		System.out.println("is the treeMap empty? " + treeMap.isEmpty());
		// treeMap.replaceAll(null);
	}

	public static void main(String[] args) {

		TreeMapEx tm = new TreeMapEx();
		tm.treeMapFunctions();

	}

}
