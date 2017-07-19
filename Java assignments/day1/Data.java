package apurva.assignment.data;

	public class Data {
		static int a;
		static char ch;

		/*The Default intialization allows assignment of default values to the uninitialized 
		class fields(variables) . But if the variables are defined inside a method inside a class, 
		the default initialization doesn't occur and it throws an error. So, in the Data.java, 
		the second method of printing local method's variable doesnt work, while the first 
		method work because it had class fields printed which was initialized automatically.
		*/

	public static void printFields(){
		System.out.println(a);
		System.out.println(ch);
	}

	public static void printLocals(){
		int aLocal;
		int bLocal;
		System.out.println(aLocal);
		System.out.println(bLocal);
		}


	public static void main(String[] args){
		printFields();
		printLocals();
	}
	}		
