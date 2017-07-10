package apurva.assignment;

	public class Singleton {
		String nonStaticString;

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
