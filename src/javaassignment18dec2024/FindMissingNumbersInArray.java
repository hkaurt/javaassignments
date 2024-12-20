package javaassignment18dec2024;

import java.util.Arrays;

public class FindMissingNumbersInArray {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 8, 6 };

		Arrays.sort(arr); // sort array arr={3,4,6,8}

		int num = 1; // num var for numbers to check from 1 to highest number in array

		for (int i = 0; i <= arr.length - 1; i++) {

			while (arr[i] != num) {               //compare number with each element of array, dont know number of iterations so while loop
				System.out.println(num);          //if none of element is equal to num then print num
				num++;                            // num increment to compare next num
			}

			num++;             //if while loop condition not true then increment num to compare next num in while loop until it reaches highest element in array
		}

	}

}
