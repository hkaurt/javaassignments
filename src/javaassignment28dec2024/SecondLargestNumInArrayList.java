package javaassignment28dec2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumInArrayList {

	/*
	 * edge cases: 1. if ArrayList size<2, "no Largest Element" 2. else find second
	 * largest number
	 */

	ArrayList<Integer> num = new ArrayList<>();

	public void findSecondLargestNum() {

		// CRUD
		// create - add()
		num.add(13);
		num.add(56);
		num.add(0);
		num.add(101);
		num.add(100);

		System.out.println("ArrayList in insertion order: " + num);

		if (num.size() < 2) {

			System.out.println("No Largest Element ");

		} else {

			// read- get()
			int largest = num.get(0);
			for (int i = 0; i < num.size(); i++) {

				if (num.get(i) > largest) {

					largest = num.get(i);

				}

			}
			System.out.println("Largest= " + largest);

			int secondLargest = num.get(0);
			for (int i = 0; i < num.size(); i++) {
				if (largest > num.get(i) && num.get(i) > secondLargest) {
					secondLargest = num.get(i);
				}
			}

			System.out.println("SecondLargest= " + secondLargest);
		}

		// short way using Collections wrapper class - sort and reverseOrder method

		// in decending order
		Collections.sort(num, Collections.reverseOrder());

		System.out.println("ArrayList in asc order: " + num);
		System.out.println("LargestNum= " + num.get(0));
		System.out.println("SecondLargestNum= " + num.get(1));

		// update - set(index, ele);
		num.set(2, 3);

		// delete - remove(index)
		num.remove(num.size() - 1);

		System.out.println(num);
		
		num.isEmpty();
		
		List<Integer> list=num.reversed();  // becz this will return list of reverse ele of type integer 
		
		System.out.println(list);
		
	}

	public static void main(String[] args) {

		SecondLargestNumInArrayList obj = new SecondLargestNumInArrayList();
		obj.findSecondLargestNum();

	}

}
