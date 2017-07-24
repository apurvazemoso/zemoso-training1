/*The output of the following code: 

No errors thrown for your selected number.
java.lang.NullPointerException
BYE-BYE
*/ 
import java.util.*;
/*
package day4;*/
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
		String str = Integer.toString(hi.numm);
		int len = str.length();
		if(hi.numm<100) throw new E1("You are inelegible because it is 2-digit number");
		else if (100<=hi.numm && hi.numm <1000) throw new E2("You are inelegible because  it is 3-digit number");
		else if (9999<hi.numm) throw new E2("You are inelegible because is "+ len + " digit number.");
		else System.out.println("No errors thrown for 4-digit number.");
	}

	//null pointer exception thrown still 'finally' clause excecuted because case2 elements haven't been instantiated.
	public static void main(String[] args){

		System.out.println("Enter the number of times you wanna try. Only 4 digit number is acceptable.");
		Scanner in1 = new Scanner(System.in);
		int noOfTrials = in1.nextInt();
			
		while (noOfTrials > 0){
			noOfTrials = noOfTrials - 1;
		try{
			ExceptionHandling case1 = new ExceptionHandling();
			Scanner in = new Scanner(System.in);
			int input = in.nextInt();
			case1.numm = input;
			validation(case1);
		}
		catch(Exception e){
			System.out.println(e);
		}

		finally{
			System.out.println("BYE-BYE");
		}
	}
	}

}
