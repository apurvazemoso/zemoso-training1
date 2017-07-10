package apurva.assignment;

	public class Data {
		static int a;
		static char ch;

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
