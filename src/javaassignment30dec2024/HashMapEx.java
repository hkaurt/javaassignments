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
public class HashMapEx {

	HashMap<Integer, String> empData = new HashMap<>();

	public void hashMapFunctions() {

		// CREATE --put()--> no insertion order but sorted
		empData.put(1, "John");
		empData.put(2, "Delta");
		empData.put(5, null); // both null allowed
		empData.put(null, "Mike");
		empData.put(3, null);
		empData.put(5, "Mike"); // duplication of key not allowed, will override first one
		empData.put(40, "Delta");// duplication of value allowed
		empData.put(4, "Delta");
		empData.putIfAbsent(8, null);
		
		System.out.println(empData);

		// READ--get(object key) or get(value)
		System.out.println(empData.get(2));

		// UPDATE --replace(key, ele)
		empData.replace(2, "Doe");

		// DELETE --remove()
		empData.remove(4); // remove
		empData.remove(3, null);
		System.out.println(empData);

		System.out.println(empData.size());
		Object cloneEmp = empData.clone();
		System.out.println(cloneEmp);
		System.out.println(empData.containsKey(4));
		System.out.println(empData.containsValue("Doe"));
		System.out.println(empData.equals(cloneEmp));
		System.out.println(empData.toString()); // returns string

		empData.clear();
		System.out.println(empData);
		System.out.println(empData.isEmpty());
//// entrySet();

	}

	public static void main(String[] args) {

		HashMapEx hm = new HashMapEx();
		hm.hashMapFunctions();

	}

}
