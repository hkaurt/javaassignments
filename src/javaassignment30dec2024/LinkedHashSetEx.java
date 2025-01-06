package javaassignment30dec2024;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

//check following:
//Maintain insertion order
//Duplicate allowed
//Null allowed
//Create
//Read
//Update
//Delete
public class LinkedHashSetEx {

	LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
	LinkedList<Integer> linkedList= new LinkedList<>();

	
	public void linkedHashSetFunction() {
		
		//create--> add()-- follows insertion order
		linkedList.add(80);
		
		linkedHashSet.add(10);
		linkedHashSet.add(50);
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(null);   //null allowed
		linkedHashSet.add(null);   //no duplicates
		linkedHashSet.addFirst(40);
		linkedHashSet.addLast(100);
		linkedHashSet.addAll(linkedList);
		
		System.out.println("print linkedHashSet: "+ linkedHashSet);
		
		//read -->iterator or for each 
		System.out.println("first ele : "+linkedHashSet.getFirst());
		System.out.println("last ele : "+ linkedHashSet.getLast());
		
		System.out.println("all ele of linkedHashSet using for each loop: ");
		for(Integer data: linkedHashSet) {
			System.out.println(data);
		}
		
		System.out.println("all ele of linkedHashSet using for iterator: ");
		//use iterator
		Iterator<Integer> iterator= linkedHashSet.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		//update-->no, only remove and add
		
		//delete--> remove()
		linkedHashSet.remove(10);
		System.out.println("after removing 10: "+linkedHashSet);
        linkedHashSet.removeAll(linkedList);
        System.out.println("after removing linkedList: "+linkedHashSet);
        linkedHashSet.removeFirst();
        linkedHashSet.removeLast();
        System.out.println("after removing first and last ele : "+linkedHashSet);
        
        linkedHashSet.size();
       Object clonedLinkedHashSet= linkedHashSet.clone();
        System.out.println("print cloned linkedHashSet"+clonedLinkedHashSet);
        System.out.println("is clonedLinedHashSet equal to linkedHashSet?"+ linkedHashSet.equals(clonedLinkedHashSet));
        System.out.println(linkedHashSet.containsAll(linkedHashSet));
        System.out.println(linkedHashSet.contains(50));
        
        linkedHashSet.clear();
        System.out.println("print after clearing :" + linkedHashSet );
        
        System.out.println("is the linkedHashSet empty? "+ linkedHashSet.isEmpty());
        
	}
	
	public static void main(String[] args) {
		
		LinkedHashSetEx ls=new LinkedHashSetEx();
		ls.linkedHashSetFunction();
		
	}
}
