package javaassignment30dec2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ConvertLinkedlistToSet {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(50);
		linkedList.add(40);
		linkedList.add(30);
		linkedList.add(80);
		linkedList.add(40);
		linkedList.add(20);
		
		System.out.println(linkedList);
		
		//LinkedList to LinkedHashSet
		LinkedHashSet<Integer> linkedHSet= new LinkedHashSet<>(linkedList);
		System.out.println(linkedHSet);   //follow insertion order and no duplicates
		
		LinkedList<Integer> linkedListt= new LinkedList<>(linkedHSet);
		System.out.println(linkedListt);
		
		//LinkedList to HashSet- NO INSERTION ORDER, NO DUPLICATES
		HashSet<Integer> hs  =new HashSet<>(linkedList);
		System.out.println(hs);
		
		LinkedList<Integer> linkedLstt= new LinkedList<>(hs);
		System.out.println(linkedLstt);
		
		//LinkedList to TreeSet  --sorted and no duplicates
		TreeSet<Integer>ts= new TreeSet<>(linkedList);
		System.out.println(ts);
		
		LinkedList<Integer> linkedLst= new LinkedList<>(ts);
		System.out.println(linkedLst);
		
	}
}