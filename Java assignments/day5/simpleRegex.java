//Regex Sentence check that begins with capital and ends with period.
package day5;
public class simpleRegex {
	public static void main(String[] args) {
		String check = "^[A-Z][\\s\\S&&[^.:?!]]*[.:?!]$";
		String s0 = "Disssssd dbhebdj bhf f dfnbdfjdefd.";
		String s1 = "Lorem ipsum is - 123.";
		String s2 = "Why why why?";
		String s3 = "H!";
		String s4 = "hddd.";

		/*

		^ means starts with.

		[A-Z] means any 1 character from A to Z one time.

		[\\s\\S&&[^.:?!]]* -- \\s means white spaces included and all the non white spaces as well except for dot, colon,
		question mark, and exclaimation mark. (shown by by &&[^.:?!]).

		* means zero or more occurence.

		[.:?!] means any one character from dot, colon, question mark, and exclaimation mark.

		$ means end of sentence.

		*/

		System.out.println(s0.matches(check));
		System.out.println(s1.matches(check));
		System.out.println(s2.matches(check));
		System.out.println(s3.matches(check));
		System.out.println(s4.matches(check));
		
	}
}

/*
Output is : 
true
true
true
true
false
*/
