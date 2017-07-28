package checkAlpha;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/*
The worst case time complexity is string length + 52 since HashMap's containsKey only has O(1) complexity.
Space complexity is O(string length + 26). The space occupied by a string is (length of string + 1) byte.
We store 26 total alphabets in hashmap, then check true for each character of the letter of the input string in the hashmap.
If any entry in hashmap is checked false, we return incomplete string.
*/

class CheckString{

	CheckString(String test, String mainAlpha){

		if(test.length() < 26) {
			System.out.println("Not complete string.");
			System.exit(0);
			}

		int checkk = 1;

		Map<Character, Boolean> m = new HashMap<Character, Boolean>();

		for (int y = 0; y < mainAlpha.length(); y++){
				m.put(mainAlpha.charAt(y), false);
			}

		for (int y = 0; y < test.length(); y++){
			char g = Character.toLowerCase(test.charAt(y));
			if(m.containsKey(g)) {
				if(m.get(g) == Boolean.FALSE){
				    m.put(g, true);
				    }
			}
		}

		for (Map.Entry<Character, Boolean> entry : m.entrySet())
		{
			if(entry.getValue() == false) {
				checkk = 0;
				break;
			}
		}

		if(checkk == 0) System.out.println("Not complete string.");

		else System.out.println("Great! Complete string.");
		}
}



public class checkAlphabet {
    public static void main(String[] args) {
		String test;
		System.out.println("Enter the string you want to test : ");
		Scanner input = new Scanner(System.in);
		test = input.next();
		String mainAlpha = "abcdefghijklmnopqrstuvwxyz";
		CheckString a = new CheckString(test, mainAlpha);
		
	}
}