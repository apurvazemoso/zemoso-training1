/*The output of the following code: 

No errors thrown for your selected number.
java.lang.NullPointerException
BYE-BYE
*/
package day4;
class E1 extends Exception{
	E1(String type){
		super(type);
	}
}

class E2 extends Exception{
	E2(String type){
		super(type);
	}
}

class E3 extends Exception{
	E3(String type){
		super(type);
	}
}

public class ExceptionHandling{
	int numm; // 3 custom exceptions
	public static void validation(ExceptionHandling hi) throws E1, E2, E3{
		if(hi.numm>100) throw new E1("You are inelegible because of E1 criteria");
		else if (hi.numm == 0) throw new E2("You are inelegible because of E2 criteria");
		else if (hi.numm == 1000) throw new E2("You are inelegible because of E2 criteria");
		else System.out.println("No errors thrown for your selected number.");
	}

	public static void main(String[] args){
		try{
		ExceptionHandling case1 = new ExceptionHandling();
		case1.numm = 10;
		validation(case1);
		ExceptionHandling[] case2 = new ExceptionHandling[4];
		for(int i = 0;i<4;i++){
			case2[i].numm = i*15;
			validation(case2[i]); //null pointer exception thrown still 'finally' clause excecuted because case2 elements haven't been instantiated.
		}

	}
		catch(Exception e){
			System.out.println(e);
		}

		finally{
			System.out.println("BYE-BYE");
		}

	}

}
