package javaassignment21dec2024;

public class EvenWordsInString {

	public static void main(String[] args) {

		String sentence = "Print words which have even number of letters from this sentence ";

		int evenWordCount = 0; // count number of words with even number of letters

		// edge cases:
		/*
		 * 1. If string is not blank and words with even number of letters found then print those words
		 * 2. No word with even number of letters found 
		 * 3. String is blank
		 */

		// condition if string is not blank
		if (!sentence.isBlank()) {

			// spilt string into array of words
			String[] words = sentence.split(" ");

			// read each word ele of String array
			for (String word : words) {
				
				// condition if length of each word is even then print the word
				if (word.length() % 2 == 0) {
					System.out.println(word);
					evenWordCount++; // increase evenWordCount each time if length of word is found even
				}
			}

			// condition if string not blank but no word with even number of letters found
			if (evenWordCount == 0) {
				System.out.println("no word with even number of letters found, the length of each word is odd in the given sentence");
			}

		} else // String is blank
			System.out.println("String is blank");
	}
}
