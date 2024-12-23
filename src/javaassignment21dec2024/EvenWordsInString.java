package javaassignment21dec2024;

public class EvenWordsInString {

	public static void main(String[] args) {

		String str = "Print even word from this sentence ";
		
		int evenWordCount = 0; // count number of even words

		// edge cases:
		/*
		 * 1. If string is not blank and even words present then print 
		 * 2. No even word found 
		 * 3. String is blank
		 */
		
		// condition if string is not blank
		if (!str.isBlank()) {

			// spilt string into array of words
			String[] strA = str.split(" ");

			// read each word ele of String array
			for (String st : strA) {

				// condition if length of each word is even count then print the word
				if (st.length() % 2 == 0) {
					System.out.println(st);
					evenWordCount++; // increase evenWordCount each time even word is found
				}
			}

			// condition if string not blank but no even word
			if (evenWordCount == 0) {
				System.out.println("no even word found, the sentence contains all odd words");
			}

		} else                        //if String is blank
			System.out.println("String is blank");
	}
}
