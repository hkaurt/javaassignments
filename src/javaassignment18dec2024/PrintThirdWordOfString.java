package javaassignment18dec2024;

public class PrintThirdWordOfString {

	public static void main(String[] args) {

		String str = "Print third word Of this string";
		
		// split string and get array of words of string
		String s[] = str.split(" ");   

		//if string array length is more or equal to 3 then only print third word otherwise there is no third word
		if (s.length >= 3)
			System.out.println(s[2]);
		else
			System.out.println("String is less than 3 words");
	
	}
	
}
