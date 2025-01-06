package javaassignment30dec2024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ConvertTreeMapToHashMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(5, "John");
		treeMap.put(7, "Kate");
		treeMap.put(1, null); // duplicate values allowed
		treeMap.put(6, null);// null allowed for value only
		treeMap.put(3, "Ron"); // duplicate keys not allowed
		treeMap.put(3, "David");
		treeMap.put(4, "Peter");
		treeMap.put(2, "Mike");
		treeMap.put(9, "Peter");
		treeMap.put(8, "Ray");
		
		System.out.println(treeMap);  // sorted
		
		////TreeMap to HashMap  -- not sorted  or any order
		HashMap<Integer, String> hashMap= new HashMap<>(treeMap);
		System.out.println(hashMap);
		
		TreeMap<Integer, String> treeMapp= new TreeMap<>(hashMap);
		System.out.println(treeMapp);
		
		//TreeMap to LinkedHashMap  -- follows insertion order so remain same as treeMap
		LinkedHashMap<Integer, String> linkedHashMap= new LinkedHashMap<>(treeMap);
		System.out.println(linkedHashMap);
		
		TreeMap<Integer, String> ttreeMap= new TreeMap<>(linkedHashMap);
		System.out.println(ttreeMap);
		
	}

}
