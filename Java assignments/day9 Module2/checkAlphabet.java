import java.util.*;  
import java.lang.*;
/*The time complexity is string length + 56 since HashMap's containsKey only has O(1) complexity.
Space complexity is O(String Length + 26).
We store letters of string in hashmap(not repeating keys), then check from each character of the alphabets whether it is in the HashMap or not.
If it is not present, we break the string and say it is not complete string
*/
class checkAlphabet {
    public static void main(String[] args) {
		String mainAlpha = "abcdefghijklmnopqrstuvwxyz";
		String test = "abcdefghiJKLM";
		test = test.replaceAll("[^A-Za-z]","");
		if(test.length() < 26) {
				System.out.println("Not complete string.");
				System.exit(0);
		}
		char[] alphabets = test.toCharArray();
		int checkk = 1;
		Map<Character, Integer> m = new HashMap<Character, Integer>();

		//this for loop fills the characters of test string in hashmap in lowerCase irrespective of the actual case of the letter.
		for (int y = 0; y < test.length(); y++){
			if(m.containsKey(Character.toLowerCase(alphabets[y]))){}
			else{
				m.put(Character.toLowerCase(alphabets[y]), 1);
			}
		}
		
		char[] alphabet = mainAlpha.toCharArray();
		//System.out.println(test + " " + test.length());

		//this for loop check alphabets one by one. If any alphabet is not present it will break the loop and print the same.
		for(int y = 0; y < mainAlpha.length(); y++){
			char ch = alphabet[y];
			if(m.containsKey(ch)) checkk = 1; 
			else{
				checkk = 0; System.out.println("Not complete string.");
				break;
			}
		}
		if (checkk == 1) System.out.println("Great! Complete string!");
	}
}