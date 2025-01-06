package javaassignment30dec2024;

import java.util.LinkedHashMap;

//check following:
//Maintain insertion order
//Duplicate allowed
//Null allowed
//Create
//Read
//Update
//Delete
public class LinkedHashMapEx {

	LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
	LinkedHashMap<Object, Object> linkedSHashMap = new LinkedHashMap<>();

	public void linkedHashMapFunctions() {

		// create--put()--> follows insertion order
		linkedSHashMap.put("Phone number", null);

		linkedHashMap.put("FirstName", "John");
		linkedHashMap.put("LastName", "Miller");
		linkedHashMap.put("Country", "Canada");
		linkedHashMap.put("Age", 42);
		linkedHashMap.put("Father's Name", "Mike");
		linkedHashMap.put("MiddleName", "Miller");
		linkedHashMap.put("LastName", "Miller"); // duplicates allowed for value, not keys
		linkedHashMap.put(null, null); // null allowed
		linkedHashMap.putAll(linkedSHashMap);
		linkedHashMap.putIfAbsent("height", 165);
		linkedHashMap.putFirst("id", 1);
		linkedHashMap.putLast("weight",180 );
		
		System.out.println("print linkedHashMap: " + linkedHashMap);

		// read--> get(Key)
		System.out.println("value for key-Age: " + linkedHashMap.get("Age"));
////    System.out.println(linkedHashMap.getOrDefault("Country", "Canada"));

		// update-->
		linkedHashMap.replace("Country", "USA");
		linkedHashMap.replace("Age", 42, 40);
		System.out.println("linkedHashMap after replacing: " + linkedHashMap);

////    linkedHashMap.replaceAll();

		// delete --> remove()
		linkedHashMap.remove("LastName");
		System.out.println(linkedHashMap);

		linkedHashMap.remove("Country", "USA");
		System.out.println("linkedHashMap after removal: " + linkedHashMap);

		Object clonedLinkedHashMap = linkedHashMap.clone();
		System.out.println("Cloned linkedHashMap" + clonedLinkedHashMap);
		System.out.println(linkedHashMap.equals(clonedLinkedHashMap));

		System.out.println("Does it contains MiddleName: " + linkedHashMap.containsKey("MiddleName"));
		System.out.println("Does it contains value- Miller: " + linkedHashMap.containsValue("Miller"));

		System.out.println("reversed linkedHashMap" + linkedHashMap.reversed());
////	linkedHashMap.entrySet();
////	linkedHashMap.forEach(null);
		System.out.println("print all keys only: " + linkedHashMap.keySet());
		System.out.println("print all values only: " + linkedHashMap.values());
		System.out.println("size : " + linkedHashMap.size());
		System.out.println("Print last Entry: " + linkedHashMap.lastEntry());
		System.out.println("Print first Entry: " + linkedHashMap.firstEntry());
////    System.out.println(linkedHashMap.merge(linkedHashMap, linkedSHashMap, "Age"));

		System.out.println("sequenced keySet" + linkedHashMap.sequencedKeySet());
		System.out.println("sequenced keyValues" + linkedHashMap.sequencedValues());

		linkedHashMap.clear();
		System.out.println(linkedHashMap.isEmpty());

	}

	public static void main(String[] args) {

		LinkedHashMapEx lm = new LinkedHashMapEx();
		lm.linkedHashMapFunctions();

	}
}
