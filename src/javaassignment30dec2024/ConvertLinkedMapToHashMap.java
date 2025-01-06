package javaassignment30dec2024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ConvertLinkedMapToHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("FirstName", "John");
		linkedHashMap.put("LastName", "Miller");
		linkedHashMap.put("Country", "Canada");
		linkedHashMap.put("Father's Name", "Mike");
		linkedHashMap.put("MiddleName", "Miller");
		linkedHashMap.put("LastName", "Miller");
		// linkedHashMap.put(null, null); // null allowed but throws NullPointerException for treeMap if key is null

		System.out.println(linkedHashMap);  // insertion order

		// LinkedHashMap to HashMap- neither sorted nor insertion order
		HashMap<String, String> hm = new HashMap<>(linkedHashMap);
		System.out.println(hm);

		LinkedHashMap<String, String> linkedHashMapp = new LinkedHashMap<>(hm);
		System.out.println(linkedHashMapp);

		//LinkedHashMap to TreeMap- sorted 
		TreeMap<String, String> tm = new TreeMap<>(linkedHashMap);
		System.out.println(tm); // NullPointerException

	}
}
