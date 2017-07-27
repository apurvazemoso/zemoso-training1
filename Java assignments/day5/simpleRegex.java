//Regex Sentence check that begins with capital and ends with period.

package day5;
import java.util.Scanner;

public class simpleRegex {
	public static void main(String[] args) {
		/*

		^ means starts with.

		[A-Z] means any 1 character from A to Z one time.

		[\\s\\S&&[^.:?!]]* -- \\s means white spaces included and all the non white spaces as well except for dot, colon,
		question mark, and exclaimation mark. (shown by by &&[^.:?!]).

		* means zero or more occurence.

		[.:?!] means any one character from dot, colon, question mark, and exclaimation mark.

		$ means end of sentence.

		*/
		String check = "^[A-Z][\\s\\S&&[^.:?!]]*[.:?!]$";


		/*String s0 = "Disssssd dbhebdj bhf f dfnbdfjdefd.";
		String s1 = "Lorem ipsum is - 123.";
		String s2 = "Why why why?";
		String s3 = "H!";
		String s4 = "hddd.";*/
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		System.out.println("Answer of your string: " + test +" is = " + test.matches(check));
		/*System.out.println("Answer of inbuilt test string : Disssssd dbhebdj bhf f dfnbdfjdefd. = "+ s0.matches(check));
		System.out.println("Answer of inbuilt test string : Lorem ipsum is - 123. = " + s1.matches(check));
		System.out.println("Answer of inbuilt test string : Why why why? = " + s2.matches(check));
		System.out.println("Answer of inbuilt test string : H! = " + s3.matches(check));
		System.out.println("Answer of inbuilt test string : hddd. = " + s4.matches(check));
		*/
		
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
