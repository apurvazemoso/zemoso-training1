package apurva.assignment;

	public class Singleton {
		String nonStaticString;

		
		/*Initialization of a non static string is not possible from a static method directly, 
		but it is possible if we make object of the class and then initialize the non static field 
		from any type of method.*/

		public static Singleton methodOne(String string1){
			
			Singleton objectOfClass = new Singleton();
			objectOfClass.nonStaticString = string1;
			return objectOfClass;
			}

		public void methodTwo(){
			System.out.println(nonStaticString);
		}

		public static void main(String[] args){
			Singleton Singleton = new Singleton();
			Singleton.methodTwo();
			System.out.println(Singleton.methodOne("String Initiated!").nonStaticString);
		}
	}
